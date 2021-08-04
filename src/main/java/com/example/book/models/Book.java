package com.example.book.models;



import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // get 함수를 일괄적으로 만들어줍니다.
@NoArgsConstructor // 기본 생성자를 만들어줍니다.
@Entity // DB 테이블 역할을 합니다.
public class Book extends Timestamped{

    // ID가 자동으로 생성 및 증가합니다.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    // 반드시 값을 가지도록 합니다.
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String link;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int discount;

    @Column(nullable = false)
    private String publisher;

    @Column(nullable = false)
    private int pubdate;

    @Column(nullable = false)
    private String description;

     @Column(nullable = false)
     private int myprice;

    public Book(BookRequestDto bookRequestDto) {
        this.title = bookRequestDto.getTitle();
        this.link = bookRequestDto.getLink();
        this.image = bookRequestDto.getImage();
        this.author = bookRequestDto.getAuthor();
        this.price = bookRequestDto.getPrice();
        this.discount = bookRequestDto.getDiscount();
        this.publisher = bookRequestDto.getPublisher();
        this.pubdate = bookRequestDto.getPubdate();
        this.description = bookRequestDto.getDescription();
        this.myprice = 0;
    }

    public  void update(BookMypriceRequestDto mypriceRequestDto) {
          this.myprice = mypriceRequestDto.getMyprice();
    }


}