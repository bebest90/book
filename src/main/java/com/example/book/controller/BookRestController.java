package com.example.book.controller;

import com.example.book.models.Book;
import com.example.book.models.BookRepository;
import com.example.book.models.BookRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController
public class BookRestController {

    private final BookRepository bookRepository;

    @GetMapping("/api/books")
    public List<Book> readBooks() {
        return bookRepository.findAll();

    }

    @PostMapping("/api/books")
    public Book createBooks(@RequestBody BookRequestDto bookRequestDto) {
        Book book = new Book(bookRequestDto);
        return bookRepository.save(book);

    }

}
