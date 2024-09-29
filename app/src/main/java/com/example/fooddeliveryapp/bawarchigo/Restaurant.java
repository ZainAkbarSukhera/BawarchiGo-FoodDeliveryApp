package com.example.fooddeliveryapp.bawarchigo;

public class Restaurant {
    private String name;
    private String distance;
    private String rating;
    private int imageResourceId; // Image resource ID

    // Constructor
    public Restaurant(String name, String distance, String rating, int imageResourceId) {
        this.name = name;
        this.distance = distance;
        this.rating = rating;
        this.imageResourceId = imageResourceId;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDistance() {
        return distance;
    }

    public String getRating() {
        return rating;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
