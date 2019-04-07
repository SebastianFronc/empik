package com.sebastian.Products.Discount;

import com.sebastian.Cart;
import com.sebastian.Products.Poster;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class DiscountPosterTest {

    @Test
    public void ShouuldBeOne() {

        Cart cart = new Cart();
        Poster poster1 = new Poster(1L,"Plakat 1", BigDecimal.valueOf(30), new DiscountPoster());
        Poster poster2 = new Poster(2L,"Plakat 2", BigDecimal.valueOf(20), new DiscountPoster());
        Poster poster3 = new Poster(3L,"Plakat 3", BigDecimal.valueOf(10), new DiscountPoster());
        cart.addProduct(poster1);
        cart.addProduct(poster2);
        cart.addProduct(poster3);


        assertEquals(poster3.getPriceWithDiscount(cart), new BigDecimal("1"));
        assertEquals(poster2.getPriceWithDiscount(cart), new BigDecimal("20"));
        assertEquals(poster1.getPriceWithDiscount(cart), new BigDecimal("30"));



    }
}