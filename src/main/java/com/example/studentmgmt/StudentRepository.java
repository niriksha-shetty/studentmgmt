package com.example.studentmgmt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // This empty interface gives you findById, findAll, save, and deleteById out of the box!
}
