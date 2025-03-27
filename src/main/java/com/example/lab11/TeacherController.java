package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class TeacherController {
    @GetMapping("/teacher")
    public String getTeacher() {
        Teacher teacher = new Teacher("Mr. Smith", "Mathematics");
        return "Teacher: " + teacher.getName() + ", Subject: " + teacher.getSubject();
    }
}
