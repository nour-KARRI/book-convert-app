package com.api.bolough.service.impl;

import com.api.bolough.model.Book;
import com.api.bolough.repository.BookRepository;
import com.api.bolough.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAll() {
        List<Book> books= new ArrayList<Book>();
        bookRepository.findAll().forEach(book -> books.add(book));
        return books;
    }
}
