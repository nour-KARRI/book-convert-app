package com.api.bolough.web.rest;

import com.api.bolough.model.Book;
import com.api.bolough.repository.BookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class BookResourceIT {

    @Autowired
    private BookResource bookResource;

    @Autowired
    private BookRepository bookRepository;


    @Test
    void bookTest() {
        Book b1= new Book();
        b1.setId(1L);
        b1.setFrenchName("Le Livre de la Purification");
        b1.setArabicName("كتاب الطهارة");

        bookRepository.save(b1);

        List<Book> books =bookResource.getAllBooks();
        Assertions.assertEquals(books.size(), 1);
    }

}
