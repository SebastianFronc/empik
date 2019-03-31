package com.sebastian.Products.Discount;

import com.sebastian.Cart;
import com.sebastian.Products.Audio;
import com.sebastian.Products.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DiscountAudio extends Discount{

    @Override
    public BigDecimal getPriceDiscount(Product product, Cart cart) {
        Audio audio = (Audio) product;
        long years = ChronoUnit.YEARS.between(audio.getPublishmentDate(), LocalDate.now());
        return BigDecimal.valueOf((100.0-years)/100).multiply(product.getPrice());
    }
}
