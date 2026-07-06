package com.example.studentmgmt;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> getAll() { return service.getAllStudents(); }

    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) { return service.getStudentById(id); }

    @PostMapping
    public Student create(@Valid @RequestBody Student student) { return service.addStudent(student); }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @Valid @RequestBody Student student) { return service.updateStudent(id, student); }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteStudent(id);
        return "Student deleted successfully!";
    }
}
