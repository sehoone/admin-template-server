package com.sehoon.admintempleteserver.module.sample.vo;

import lombok.Data;

@Data
public class TableItem {
    String id;
    String imageUrl;
    String imageUrl2;
    boolean open;
    String status;
    String productName;
    String price;
    String currency;
    int quantity;
    boolean available;
    String category;
    String releaseDate;
    double rating;
    String description;
    double weight;
    String color;
    boolean inProduction;
}