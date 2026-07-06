package com.example.studentmgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() { return repository.findAll(); }
    public Student getStudentById(Long id) { return repository.findById(id).orElseThrow(() -> new RuntimeException("Student not found")); }
    public Student addStudent(Student student) { return repository.save(student); }
    public void deleteStudent(Long id) { repository.deleteById(id); }

    public Student updateStudent(Long id, Student details) {
        Student existing = getStudentById(id);
        existing.setName(details.getName());
        existing.setAge(details.getAge());
        existing.setCourse(details.getCourse());
        existing.setEmail(details.getEmail());
        return repository.save(existing);
    }
}