package com.ust.javapractice.DesignPatterns.Builder;

public class CarSchema {
    private final int id;
    private final String brand;
    private final String model;
    private final String color;
    private final int nbrDoors;
    private final String screenType;
    private final double weight;
    private final double height;

    CarSchema(int id, String brand, String model, String color, int nbrDoors, String screenType, double weight, double height) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.nbrDoors = nbrDoors;
        this.screenType = screenType;
        this.weight = weight;
        this.height = height;

    }
}
