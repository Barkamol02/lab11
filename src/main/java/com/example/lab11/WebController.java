package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

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
                + "</ul>";
    }

    @GetMapping("/about")
    public String about() {
        return "<h2>About Our Application</h2>"
                + "<p>This is a web application</p>";
    }

    @GetMapping("/faq")
    public String faq() {
        return "<h2>Frequently Asked Questions</h2>"
                + "<ul>"
                + "<li><strong>What services do you offer?</strong> We offer web development and mobile app development.</li>"
                + "<li><strong>How can I contact you?</strong> Please visit our contact page for more information.</li>"
                + "<li><strong>Where are you located?</strong> We are a global company with team members from various locations.</li>"
                + "</ul>";
    }

    @GetMapping("/contact-us")
    public String contactUs() {
        return "<h2>Contact Us</h2>"
                + "<p>Email: dontwrite@please.com</p>"
                + "<p>Phone: 80085</p>"
                + "<p>Address: 123 Main Street, Tashkent, Uzb</p>";
    }

    @GetMapping("/team")
    public String team() {
        return "<h2>Meet Our Team</h2>"
                + "<ul>"
                + "<li><strong>Jane Doe:</strong> CEO & Founder. Jane has over 10 years of experience.</li>"
                + "<li><strong>John Smith:</strong> Lead Developer. Jane specializes in full-stack development.</li>"
                + "<li><strong>Sam Brown:</strong> SEO Expert. Sam helps optimize websites for search engines.</li>"
                + "</ul>";
    }

    // Task 1: Greet a user by their name
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // Task 2: Calculate the square of a given number
    @GetMapping("/square/{num}")
    public String square(@PathVariable int num) {
        return "The square of " + num + " is " + (num * num) + ".";
    }

    // Additional Task 1: Route to return twice the value of the given number
    @GetMapping("/double/{num}")
    public String doubleValue(@PathVariable int num) {
        return "Twice the value of " + num + " is " + (num * 2) + ".";
    }

    // Additional Task 2: Route to return the length of a given string
    @GetMapping("/length/{text}")
    public String length(@PathVariable String text) {
        return "The length of the string is " + text.length() + ".";
    }

    // Additional Task 3: Route to reverse a given string
    @GetMapping("/reverse/{text}")
    public String reverse(@PathVariable String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return "The reversed string is " + reversed + ".";
    }

    // Additional Task 4: Route to concatenate two strings
    @GetMapping("/concat/{str1}/{str2}")
    public String concat(@PathVariable String str1, @PathVariable String str2) {
        return "The concatenated result is " + str1 + str2 + ".";
    }
    @GetMapping("/add/{x}/{y}")
    public String add(@PathVariable int x, @PathVariable int y) {
        return "The sum of " + x + " and " + y + " is " + (x + y) + ".";
    }

    @GetMapping("/multiply/{x}/{y}")
    public String multiply(@PathVariable int x, @PathVariable int y) {
        return "The product of " + x + " and " + y + " is " + (x * y) + ".";
    }

    @GetMapping("/subtract/{x}/{y}")
    public String subtract(@PathVariable int x, @PathVariable int y) {
        return "The difference between " + x + " and " + y + " is " + (x - y) + ".";
    }

    @GetMapping("/divide/{x}/{y}")
    public String divide(@PathVariable int x, @PathVariable int y) {
        if (y == 0) {
            return "Division by zero is not allowed.";
        }
        return "The division of " + x + " by " + y + " is " + (x / (double) y) + ".";
    }

    @GetMapping("/modulus/{x}/{y}")
    public String modulus(@PathVariable int x, @PathVariable int y) {
        return "The remainder of " + x + " divided by " + y + " is " + (x % y) + ".";
    }

    @GetMapping("/power/{base}/{exp}")
    public String power(@PathVariable int base, @PathVariable int exp) {
        return "The result of " + base + " raised to the power " + exp + " is " + Math.pow(base, exp) + ".";
    }
}
