package com.example.lab11;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class StudentController {
    private String name = "Ali";
    private int age = 21;

    @GetMapping("/student")
    public String getStudent() {
        return "Student: " + name + ", Age: " + age;
    }

    @GetMapping("/is-adult/{age}")
    public String isAdult(@PathVariable int age) {
        if (age >= 18) {
            return "Age " + age + ": You are an adult.";
        } else {
            return "Age " + age + ": You are not an adult.";
        }
    }

    @GetMapping("/update-student/{newAge}")
    public String updateStudentAge(@PathVariable int newAge) {
        this.age = newAge;
        return "Updated Student Age: " + age;
    }
}