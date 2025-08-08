package com.thehappycode.RESTful.services;

import com.thehappycode.RESTful.models.Book;

import java.util.List;

public interface BookService {

    List<Book> findAllBooks();

    Book findBookById(int id);

    void deleteAllBooks();
}
