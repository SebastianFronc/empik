package com.sebastian.Database;

import com.sebastian.Products.Product;

import java.util.Collection;
import java.util.List;

public class DatebaseCSV implements DatabaseFacade{

    @Override
    public Product getProduct(long id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void addManyProducts(Collection<Product> products) {

    }

    @Override
    public void update(Product updatedProduct) {

    }

    @Override
    public void removeProduct(Product product) {

    }
}
