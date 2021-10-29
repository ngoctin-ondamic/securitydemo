package com.example.security.student;


import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {
    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "James Bond"),
            new Student(2, "Maria Jones"),
            new Student(3, "Anna Smith")
    );

    @GetMapping
    public List<Student> getStudents() {
        System.out.println("Get All -- ");
        return STUDENTS;
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        System.out.println("Register -- ");
        System.out.println(student);
    }

    @DeleteMapping(path = "{studentID}")
    public void deleteStudent(@PathVariable int studentID) {
        System.out.println("Delete -- ");
        System.out.println(studentID);
    }

    @PutMapping(path = "{studentID}")
    public void updateStudent(@PathVariable int studentID, @RequestBody Student student) {
        System.out.println("Update -- ");
        System.out.println(String.format("%s %s", studentID, student));
    }

}
