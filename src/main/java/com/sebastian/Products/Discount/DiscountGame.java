package com.sebastian.Products.Discount;

import com.sebastian.Cart;
import com.sebastian.Products.Game;
import com.sebastian.Products.Product;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DiscountGame extends Discount{
    @Override
    public BigDecimal getPriceDiscount(Product product, Cart cart) {
            Game game;
            int discoutNumber = 3;

        if (product.getCategory().equals("GAME")){
             game = (Game) product;
        } else {
            return product.getPrice();
        }

        List<Game> gameList = cart.getCart().stream().filter(x -> x.getCategory().equals("GAME"))
                .map(x -> (Game) x)
                .filter(x -> x.getPublisher().equals(game.getPublisher()))
                .sorted(Comparator.comparing(x -> x.getPrice()))
                .collect(Collectors.toList());

        gameList = gameList.stream().limit((long) (gameList.size()/discoutNumber)).collect(Collectors.toList());

        if (gameList.contains(game)){
            return BigDecimal.ZERO;
        } else {
            return game.getPrice();
        }

    }
}
