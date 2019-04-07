package com.sebastian.Products;

import com.sebastian.Products.Discount.Discount;

import java.math.BigDecimal;

public class Game extends Product {
    private final String publisher;

    public Game(long id, String name, BigDecimal price, Discount discount, String publisher) {
        super(id, name, price, discount, "GAME");
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
}
