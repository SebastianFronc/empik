package com.sebastian.Products;

import com.sebastian.Products.Discount.Discount;

import java.math.BigDecimal;

public class AudioBook extends Book {
    int duration;

    public AudioBook(long id, String name, BigDecimal price, Discount discount, String author, int pageCounter, int duration) {
        super(id, name, price, discount, author, pageCounter);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
