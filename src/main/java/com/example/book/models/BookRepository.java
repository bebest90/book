package com.example.book.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book ,Long> {
}
