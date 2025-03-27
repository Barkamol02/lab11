package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class CourseController {
    @GetMapping("/course")
    public String getCourse() {
        Course course = new Course("Spring Boot", "3 months");
        return "Course: " + course.getTitle() + ", Duration: " + course.getDuration();
    }
}
