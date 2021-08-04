package com.example.book.models;

import lombok.Getter;

@Getter
public class BookRequestDto {
//    title , image , link , price ,author ,discount , publisher ,pubdate ,description
    private String title;
    private String link;
    private String image;
    private String author;
    private int price;
    private int discount;
    private String publisher;
    private int pubdate;
    private String description;

}
