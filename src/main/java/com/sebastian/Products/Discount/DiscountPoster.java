package com.sebastian.Products.Discount;

import com.sebastian.Cart;
import com.sebastian.Products.Poster;
import com.sebastian.Products.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class DiscountPoster extends Discount{

    @Override
    public BigDecimal getPriceDiscount(Product product, Cart cart) {

        List<Poster> posterList =
                cart.getCart().stream().filter(x -> x instanceof Poster).map(x -> (Poster) x).collect(Collectors.toList());


        return BigDecimal.ONE;
    }



}
