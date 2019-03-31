package com.sebastian.Products.Discount;

import com.sebastian.Cart;
import com.sebastian.Products.Book;
import com.sebastian.Products.Product;

import java.math.BigDecimal;

public class DiscountBook extends Discount {

    @Override
    public BigDecimal getPriceDiscount(Product product, Cart cart) {

        Book book = (Book) product;

        if (book.getPageCounter() >= 400){
             return BigDecimal.valueOf(0.6).multiply(product.getPrice());
        } else if (book.getPageCounter() >= 300){
            return BigDecimal.valueOf(0.7).multiply(product.getPrice());
        } else if (book.getPageCounter() >= 200){
            return BigDecimal.valueOf(0.8).multiply(product.getPrice());
        } else if (book.getPageCounter() >= 100){
            return BigDecimal.valueOf(0.9).multiply(product.getPrice());
        }

        return product.getPrice();
    }
}
