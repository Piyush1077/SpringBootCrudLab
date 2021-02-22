package com.example.CrudMongoDb.controller;

import com.example.CrudMongoDb.Entity.Book;
import com.example.CrudMongoDb.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;

@RestController
@RequestMapping("/books")
public class bookController {

    @Autowired
    private BookService bookService;


    @GetMapping
    public Collection<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping()
    public Book postBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
}
