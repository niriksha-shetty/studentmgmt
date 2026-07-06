# Student Management System REST API

A lightweight, robust backend Student Management System built using **Java and Spring Boot**. This project was completed as part of the project-based backend training assignment.

---

## 🚀 Project Overview
This application serves as a backend REST API following industry-standard multi-tiered architecture (Controller -> Service -> Repository). It performs full CRUD (Create, Read, Update, Delete) operations on student data.

To ensure rapid evaluation and zero environmental overhead for the grader, this project utilizes an **in-memory H2 database**, removing any requirement to install heavy database software like MySQL or Oracle.

---

## 🛠️ Technologies Used
- **Java 17/21**
- **Spring Boot 3.x**
- **Spring Data JPA** (Hibernate)
- **H2 Database** (In-Memory Data Storage)
- **Spring Boot Validation** (Data constraints validation)
- **Global Exception Handling** (Centralized runtime error processing)

---

## 🏗️ Architectural Layout
The codebase strictly follows the architectural pattern covered in our training materials:
- **`Student.java` (Model):** Defines the student properties (ID, Name, Age, Course, Email) with validation constraints.
- **`StudentRepository.java` (Data Layer):** Interfaces with Spring Data JPA to execute standard database queries out of the box.
- **`StudentService.java` (Service Layer):** Contains core business logic rules.
- **`StudentController.java` (API/Web Layer):** Exposes web endpoints for client requests.
- **`GlobalExceptionHandler.java` (Safety Layer):** Intercepts exceptions gracefully and formats them into predictable, custom JSON responses.

---

## 🔌 API Endpoints Exposed
The server runs locally on `http://localhost:8080`. The following HTTP endpoints are active:

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **GET** | `/api/students` | Retrieves all registered students (Preloaded with sample data). |
| **GET** | `/api/students/{id}` | Fetches a specific student by their unique ID. |
| **POST** | `/api/students` | Registers a new student into the system. |
| **PUT** | `/api/students/{id}` | Updates details of an existing student. |
| **DELETE**| `/api/students/{id}` | Removes a student record completely. |

---

## ⚙️ Data Pre-loading & Testing
- **Data Seeding:** Upon initial startup, the application runs a `CommandLineRunner` hook to automatically seed the database with sample student data (`Rahul Sharma` and `Priya Patel`).
- **Input Validation:** Fields like `Email` enforce proper formatting, and `Age` requires a minimum value of `18`.
- **Graceful Failures:** Accessing non-existent endpoints or missing student IDs yields a formatted `404 Not Found` JSON payload rather than a raw framework stack trace.s