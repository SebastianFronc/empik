package com.sebastian.Products;

import com.sebastian.Products.Discount.Discount;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Audio  extends Product{
    private final LocalDate publishmentDate;
    private final List<Track> track;

    public Audio(long id, String name, BigDecimal price, Discount discount, LocalDate publishmentDate, List<Track> track) {
        super(id, name, price, discount, "AUDIO");
        this.publishmentDate = publishmentDate;
        this.track = track;
    }

    public LocalDate getPublishmentDate() {
        return publishmentDate;
    }

    public List<Track> getTrack() {
        return track;
    }
}
