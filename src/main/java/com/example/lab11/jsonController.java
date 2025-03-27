package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class JsonController {

    // Task 1: Student Info in JSON
    @GetMapping("/student-info")
    public Map<String, Object> getStudentInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "Elbek");
        response.put("age", 21);
        response.put("status", "tired");
        return response;
    }

    // Task 2: Course Info in JSON
    @GetMapping("/course-info")
    public Map<String, Object> getCourseInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("title", "Web programmming");
        response.put("description", " Course on Web Programming.");
        response.put("duration", "6 weeks");
        return response;
    }

    // Task 3: User Profile in JSON
    @GetMapping("/user-profile")
    public Map<String, Object> getUserProfile() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "Jane Doe");
        response.put("email", "jane.doe@hello.com");
        response.put("role", "Teacher");
        return response;
    }

    // Task 4: Product Details in JSON
    @GetMapping("/product-details")
    public Map<String, Object> getProductDetails() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "Wireless Headphones");
        response.put("category", "Electronics");
        response.put("price", 49.99);
        response.put("stockStatus", "In Stock");
        return response;
    }

    // Task 5: Order Summary in JSON
    @GetMapping("/order-summary")
    public Map<String, Object> getOrderSummary() {
        Map<String, Object> response = new HashMap<>();
        response.put("orderId", "ORD12345");
        response.put("customerName", "Elbek Rustamov");

        List<Map<String, Object>> items = new ArrayList<>();
        Map<String, Object> item1 = new HashMap<>();
        item1.put("product", "Laptop");
        item1.put("quantity", 1);
        item1.put("price", 600.00);
        items.add(item1);

        Map<String, Object> item2 = new HashMap<>();
        item2.put("product", "Mouse");
        item2.put("quantity", 2);
        item2.put("price", 25.00);
        items.add(item2);

        response.put("items", items);
        response.put("totalCost", 650.00);
        return response;
    }
}
