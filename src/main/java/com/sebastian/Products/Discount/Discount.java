package com.sebastian.Products.Discount;

import com.sebastian.Cart;
import com.sebastian.Products.Product;

import java.math.BigDecimal;

public abstract class Discount {

    public  abstract BigDecimal getPriceDiscount(Product product, Cart cart);

}
