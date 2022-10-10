package com.api.bolough.service;

import com.api.bolough.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BookService {

    List<Book> findAll();
}
