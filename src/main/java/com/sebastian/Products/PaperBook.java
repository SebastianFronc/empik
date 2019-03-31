package com.sebastian.Products;

import com.sebastian.Products.Discount.Discount;

import java.math.BigDecimal;

public class PaperBook extends Book {

    public PaperBook(long id, String name, BigDecimal price, Discount discount, String author, int pageCounter) {
        super(id, name, price, discount, author, pageCounter);
    }
}
