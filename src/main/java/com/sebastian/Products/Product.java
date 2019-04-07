package com.sebastian.Products;

import com.sebastian.Cart;
import com.sebastian.Products.Discount.Discount;
import com.sebastian.Products.Discount.DiscountNon;

import java.math.BigDecimal;

public abstract class Product {

    private final long id;
    private final String name;
    private final BigDecimal price;
    private  Discount discount;
    private final String category;

    public Product(long id, String name, BigDecimal price, Discount discount, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Discount getDiscount() {
        return discount;
    }

    public BigDecimal getPriceWithDiscount(Cart cart) {
        return this.getDiscount().getPriceDiscount(this, cart);
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public String getCategory() {
        return category;
    }
}
