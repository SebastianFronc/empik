package com.sebastian.Products;

import com.sebastian.Products.Discount.Discount;

import java.math.BigDecimal;

public class Poster extends Product {

    public Poster(long id, String name, BigDecimal price, Discount discount) {
        super(id, name, price, discount, "POSTER");
    }
}
