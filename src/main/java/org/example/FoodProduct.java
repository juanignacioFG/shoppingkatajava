package org.example;

public class FoodProduct {

    private String name;
    private double price;

    public FoodProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}