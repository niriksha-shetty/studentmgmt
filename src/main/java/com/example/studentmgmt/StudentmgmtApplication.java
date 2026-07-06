package com.example.studentmgmt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentmgmtApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentmgmtApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(StudentRepository repository) {
        return args -> {
            Student s1 = new Student();
            s1.setName("Rahul Sharma");
            s1.setAge(21);
            s1.setCourse("Computer Science");
            s1.setEmail("rahul@example.com");

            Student s2 = new Student();
            s2.setName("Priya Patel");
            s2.setAge(22);
            s2.setCourse("Information Technology");
            s2.setEmail("priya@example.com");

            repository.save(s1);
            repository.save(s2);

            System.out.println(">> Sample student data successfully pre-loaded into H2 database!");
        };
    }
}
