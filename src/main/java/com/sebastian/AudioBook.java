package com.sebastian;

import java.math.BigDecimal;

public class AudioBook extends Book {
    int duration;

    public AudioBook(long id, String name, BigDecimal price, String author, int pageCounter, int duration) {
        super(id, name, price, author, pageCounter);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
