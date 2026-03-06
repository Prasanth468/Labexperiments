
package com.example.library;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class LibraryController {

    private List<Book> books = new ArrayList<>();

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Online Library System";
    }

    @GetMapping("/count")
    public int count() {
        return 250;
    }

    @GetMapping("/price")
    public double price() {
        return 499.99;
    }

    @GetMapping("/books")
    public List<String> getBooks() {
        return List.of("Spring Boot Guide", "Java Programming", "Microservices with Spring");
    }

    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        return "Details for Book ID: " + id;
    }

    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return "Searching for book with title: " + title;
    }

    @GetMapping("/author/{name}")
    public String getAuthor(@PathVariable String name) {
        return "Books written by author: " + name;
    }

    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {
        books.add(book);
        return "Book added successfully: " + book.getTitle();
    }

    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {
        return books;
    }
}
