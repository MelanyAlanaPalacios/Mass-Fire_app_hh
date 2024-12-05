package com.example.mass_fire;

public class Product {
    private String id;
    private String name;
    private double price;
    private String imageUrl;

    public Product() {
        // Constructor vacío necesario para Firebase
    }

    public Product(String id, String name, double price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getImageUrl() { return imageUrl; }
}

