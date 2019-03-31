package com.sebastian;
import com.sebastian.Products.Product;

import java.math.BigDecimal;
import java.util.List;

public class Cart {
    private List<Product>  cart;

   public void addProduct(Product product){
       cart.add(product);
   }

   public void removeProduct(Product product){
       cart.remove(product);
   }

   public BigDecimal getAmount(){
       BigDecimal amount = BigDecimal.ZERO;

       for (Product product:cart){
           amount = amount.add(product.getPrice());
       }
       return amount;
   }

    public BigDecimal getAmountWithDiscount(){
        BigDecimal amountWithDiscount = BigDecimal.ZERO;

        for (Product product:cart){
            amountWithDiscount = amountWithDiscount.add(product.getPriceWithDiscount(this));
        }
        return amountWithDiscount;
    }

    public BigDecimal getFinalPrice(){
       BigDecimal discount = this.getAmountWithDiscount()
               .divide(BigDecimal.valueOf(100)).setScale(0, BigDecimal.ROUND_DOWN).multiply(BigDecimal.valueOf(5));
       discount = BigDecimal.valueOf(100).subtract(discount).divide(BigDecimal.valueOf(100));
       return this.getAmountWithDiscount().multiply(discount);
    }

   public BigDecimal getCartValue(){
       return cart
               .stream()
               .map(product -> product.getPrice())
               .reduce(BigDecimal.ZERO, (sumPrice, actualPrice) -> sumPrice.add(actualPrice));
   }

    public List<Product> getCart() {
        return cart;
    }
}
