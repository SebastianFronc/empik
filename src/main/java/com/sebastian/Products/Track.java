package com.sebastian.Products;

public class Track {
    private final String name;
    private final long duration;

    public Track(String name, long duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public long getDuration() {
        return duration;
    }
}
