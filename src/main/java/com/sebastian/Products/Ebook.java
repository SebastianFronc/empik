package com.sebastian.Products;

import java.math.BigDecimal;
import java.util.List;

public class Ebook extends Book{
    private final List<String> supportedFortmats;

    public Ebook(long id, String name, BigDecimal price, String author, int pageCounter, List<String> supportedFortmats) {
        super(id, name, price, author, pageCounter);
        this.supportedFortmats = supportedFortmats;
    }

    public List<String> getSupportedFortmats() {
        return supportedFortmats;
    }
}
