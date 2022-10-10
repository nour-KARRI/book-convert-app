package com.api.bolough.web.rest;

import com.api.bolough.model.Book;
import com.api.bolough.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookResource {

    private final BookService bookService;

    public BookResource(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/books")
   public List<Book> getAllBooks(){
        List<Book> books=bookService.findAll();
        return books;
   }

}
