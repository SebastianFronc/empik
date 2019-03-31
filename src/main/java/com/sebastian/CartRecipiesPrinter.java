package com.sebastian;

import com.sebastian.Products.Product;

public class CartRecipiesPrinter {

    public void printRecepies(Cart cart){
        System.out.println("Id" + "|" + "name" + "|" + "price" + "|" + "price after discount");
        for (Product product:cart.getCart()){
            System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice() + " " + product.getPriceWithDiscount(cart));
        }
        System.out.println("Total: " + cart.getAmount() + "Total with discount: " + cart.getAmountWithDiscount());
        System.out.println("Final: " + cart.getFinalPrice());


    }

}
