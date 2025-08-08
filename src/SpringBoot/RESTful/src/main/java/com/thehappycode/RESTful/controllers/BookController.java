package com.thehappycode.RESTful.controllers;

import com.thehappycode.RESTful.models.Book;
import com.thehappycode.RESTful.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String home(){
        return "Welcome to the Book API!";
    }

    @GetMapping("/findall")
    public List<Book> findAllBooks(){
        return bookService.findAllBooks();
    }

    @GetMapping("/findbyid/{id}")
    public Book findBookById(@PathVariable int id){
        return bookService.findBookById(id);
    }

    @DeleteMapping("/delete")
    public String deleteAllBooks(){
        bookService.deleteAllBooks();
        return "All books have been deleted.";
    }
}
