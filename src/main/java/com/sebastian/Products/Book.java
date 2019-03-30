package com.sebastian.Products;

import java.math.BigDecimal;

public abstract class Book extends Product {
    private final String author;
    private final int pageCounter;

    public Book(long id, String name, BigDecimal price, String author, int pageCounter) {
        super(id, name, price);
        this.author = author;
        this.pageCounter = pageCounter;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCounter() {
        return pageCounter;
    }
}
