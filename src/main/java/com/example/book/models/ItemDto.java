package com.example.book.models;

import lombok.Getter;
import org.json.JSONObject;

@Getter
public class ItemDto {
    private String title;
    private String link;
    private String image;
    private int price;
    private int discount;
    private int pubdate;
    private String author;
    private String description;
    private String publisher;

    public ItemDto(JSONObject itemJson) {
        this.title = itemJson.getString("title");
        this.link = itemJson.getString("link");
        this.image = itemJson.getString("image");
        this.price = itemJson.getInt("price");
        this.discount = itemJson.getInt("discount");
        this.pubdate = itemJson.getInt("pubdate");
        this.author = itemJson.getString("author");
        this.description = itemJson.getString("description");
        this.publisher = itemJson.getString("publisher");
    }
}