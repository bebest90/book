package com.example.book.Service;


import com.example.book.models.Book;
import com.example.book.models.BookMypriceRequestDto;
import com.example.book.models.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepository;

    @Transactional
    public Long update(Long id, BookMypriceRequestDto MypriceRequestDto) {
        Book book = bookRepository.findById(id).orElseThrow(
                () -> new NullPointerException("아이디가 존재하지 않습니다")
        );
        book.update(MypriceRequestDto);
        return id;

    }

}
