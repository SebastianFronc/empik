package com.sebastian.Products.Discount;

import com.sebastian.Cart;
import com.sebastian.Products.Product;

import java.math.BigDecimal;

public class DiscountNon extends Discount{

    @Override
    public BigDecimal getPriceDiscount(Product product, Cart cart) {
        return product.getPrice();
    }
}
