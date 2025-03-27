package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class BookController {
    @GetMapping("/book")
    public String getBook() {
        Book book = new Book("Java Programming", "James Gosling", 39.99);
        return "Book: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: $" + book.getPrice();
    }
}