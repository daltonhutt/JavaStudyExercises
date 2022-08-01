package com.ust.javapractice.DesignPatterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    private String brand;
    private String model;
    private String color;

    protected Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    public abstract Vehicle clone();

    public void clone(List<Vehicle> vehicles ) {
        List<Vehicle> copyList = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            copyList.add(vehicle.clone());
        }
    }


}
