package com.example.lab11;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Lab11Controller {
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/square/{num}")
    public String square(@PathVariable int num) {
        return "The square of " + num + " is " + (num * num) + "."; // Fixed: multiplication, not addition
    }

    @GetMapping("/double/{num}")
    public String doubleNum(@PathVariable int num) {
        return "Double of " + num + " is " + (num * 2) + ".";
    }

    @GetMapping("/length/{text}")
    public String length(@PathVariable String text) {
        return "The length of '" + text + "' is " + text.length() + ".";
    }

    @GetMapping("/reverse/{text}")
    public String reverse(@PathVariable String text) {
        return "The reverse of '" + text + "' is '" + new StringBuilder(text).reverse().toString() + "'.";
    }

    @GetMapping("/concat/{str1}/{str2}")
    public String concat(@PathVariable String str1, @PathVariable String str2) {
        return "Concatenation of '" + str1 + "' and '" + str2 + "' is '" + str1 + str2 + "'.";
    }

    // Task 3: Exploring Return Values
    @GetMapping("/add/{x}/{y}")
    public String add(@PathVariable int x, @PathVariable int y) {
        return "The sum of " + x + " and " + y + " is " + (x + y) + ".";
    }

    @GetMapping("/multiply/{x}/{y}")
    public String multiply(@PathVariable int x, @PathVariable int y) {
        return "The product of " + x + " and " + y + " is " + (x * y) + "."; // Fixed: multiplication
    }

    @GetMapping("/subtract/{x}/{y}")
    public String subtract(@PathVariable int x, @PathVariable int y) {
        return "The difference of " + x + " and " + y + " is " + (x - y) + ".";
    }

    @GetMapping("/divide/{x}/{y}")
    public String divide(@PathVariable int x, @PathVariable int y) {
        if (y == 0) return "Error: Division by zero!";
        return "The division of " + x + " by " + y + " is " + ((double) x / y) + ".";
    }

    @GetMapping("/modulus/{x}/{y}")
    public String modulus(@PathVariable int x, @PathVariable int y) {
        if (y == 0) return "Error: Modulus by zero!";
        return "The remainder of " + x + " divided by " + y + " is " + (x % y) + ".";
    }

    @GetMapping("/power/{base}/{exp}")
    public String power(@PathVariable int base, @PathVariable int exp) {
        return base + " raised to " + exp + " is " + (int) Math.pow(base, exp) + ".";
    }

    // Task 4: Exploring Entity and Properties (Moved to separate classes below)

    // Task 5: Handling Query Parameters
    @GetMapping("/greet")
    public String greetQuery(@RequestParam(value = "name", defaultValue = "Guest") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam int x, @RequestParam int y, @RequestParam String operation) {
        switch (operation.toLowerCase()) {
            case "add": return x + " + " + y + " = " + (x + y);
            case "subtract": return x + " - " + y + " = " + (x - y);
            case "multiply": return x + " * " + y + " = " + (x * y);
            case "divide": return y != 0 ? x + " / " + y + " = " + ((double) x / y) : "Error: Division by zero!";
            default: return "Unsupported operation: " + operation;
        }
    }

    @GetMapping("/filter")
    public String filter(@RequestParam String keyword, @RequestParam String category) {
        return "Filtered results for keyword '" + keyword + "' in category '" + category + "'.";
    }

    @GetMapping("/convert")
    public String convert(@RequestParam double temperature) {
        double fahrenheit = (temperature * 9 / 5) + 32;
        return temperature + "°C is " + fahrenheit + "°F.";
    }

    @GetMapping("/discount")
    public String discount(@RequestParam double originalPrice, @RequestParam double discountRate) {
        double discountedPrice = originalPrice * (1 - discountRate / 100);
        return "Original price: $" + originalPrice + ", Discounted price: $" + discountedPrice + " (" + discountRate + "% off).";
    }

    // Task 6: Working with JSON Responses
    @GetMapping("/student-info")
    public Map<String, Object> getStudentInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "Ali");
        response.put("age", 21);
        response.put("status", "active");
        return response;
    }

    @GetMapping("/course-info")
    public Map<String, Object> courseInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("title", "Spring Boot Basics");
        response.put("description", "Learn the fundamentals of Spring Boot.");
        response.put("duration", "4 weeks");
        return response;
    }

    @GetMapping("/user-profile")
    public Map<String, Object> userProfile() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "John Doe");
        response.put("email", "john.doe@example.com");
        response.put("role", "Developer");
        return response;
    }

    @GetMapping("/product-details")
    public Map<String, Object> productDetails() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "Laptop");
        response.put("category", "Electronics");
        response.put("price", 999.99);
        response.put("stock_status", "In Stock");
        return response;
    }

    @GetMapping("/order-summary")
    public Map<String, Object> orderSummary() {
        Map<String, Object> response = new HashMap<>();
        response.put("order_id", "ORD12345");
        response.put("customer_name", "Jane Smith");
        response.put("items", "Laptop, Mouse");
        response.put("total_cost", 1029.98);
        return response;
    }
}