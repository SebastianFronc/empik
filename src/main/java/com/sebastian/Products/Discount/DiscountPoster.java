package com.sebastian.Products.Discount;

import com.sebastian.Cart;
import com.sebastian.Products.Poster;
import com.sebastian.Products.Product;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DiscountPoster extends Discount{

    @Override
    public BigDecimal getPriceDiscount(Product product, Cart cart) {
        int whichDiscoint = 3;

        List<Poster> posterList =
                cart.getCart().stream().filter(x -> x.getCategory().equals("POSTER"))
                        .map(x -> (Poster) x).collect(Collectors.toList());

        int numberOfPoster = posterList.size();
        int numnerOfDiscouted = (int) numberOfPoster/whichDiscoint;
        List<Poster> postersWithDiscount = posterList.stream().sorted(Comparator.comparing(x -> x.getPrice()))
                .limit(numnerOfDiscouted).collect(Collectors.toList());
        if (postersWithDiscount.contains((Poster) product)){
            return BigDecimal.ONE;
        }else
        return product.getPrice();
    }



}
