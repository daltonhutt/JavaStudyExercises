package com.ust.javapractice.DesignPatterns.Builder;

public class CarSchemaBuilder implements Builder {
    private int id;
    private String brand;
    private String model;
    private String color;

    @Override
    public Builder id(int id) {
        return null;
    }

    @Override
    public Builder brand(String brand) {
        return null;
    }

    @Override
    public Builder model(String model) {
        return null;
    }

    @Override
    public Builder color(String color) {
        return null;
    }
    public CarSchema build() {
        return new CarSchema(id, brand, model, color);
    }
}
