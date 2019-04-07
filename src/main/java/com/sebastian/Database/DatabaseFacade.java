package com.sebastian.Database;

import com.sebastian.Products.Product;

import java.util.Collection;
import java.util.List;

public interface DatabaseFacade {

    Product getProduct(long id);

    List<Product> getAllProducts();

    void addProduct(Product product);

    void  addManyProducts(Collection<Product> products);

    void  update(Product updatedProduct);

    void removeProduct(Product product);
}
