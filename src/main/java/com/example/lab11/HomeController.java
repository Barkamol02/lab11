package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "Welcome to Home Page!";
    }

    @GetMapping("/services")
    public String services() {
        return "<h2>Our Services</h2>"
                + "<ul>"
                + "<li>Web Development</li>"
                + "<li>Mobile App Development</li>"
                + "<li>SEO Optimization</li>"
                + "</ul>";
    }

    @GetMapping("/about")
    public String about() {
        return "This is a Spring Boot application for Lab 11, designed to demonstrate URL mapping, input parameters, and entity management.";
    }

    @GetMapping("/faq")
    public String faq() {
        return "<h2>Frequently Asked Questions</h2>"
                + "<p>Q: What is this app?</p>"
                + "<p>A: A demo app for learning Spring Boot.</p>";
    }

    @GetMapping("/contact-us")
    public String contactUs() {
        return "Contact us at: support@example.com or call (123) 456-7890";
    }

    @GetMapping("/team")
    public String team() {
        return "<h2>Our Team</h2>"
                + "<p>Ali - Developer: Expert in Java and Spring Boot.</p>"
                + "<p>Jane - Designer: Creates stunning UI/UX.</p>";
    }
}