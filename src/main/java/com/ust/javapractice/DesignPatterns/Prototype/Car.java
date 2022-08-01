package com.ust.javapractice.DesignPatterns.Prototype;

public class Car extends Vehicle {
    private int topSpeed;
    private GpsSystem gpsSystem;

    public Car() {
    }

    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
        this.gpsSystem = new GpsSystem();
    }

    @Override
    public Car clone() {
        return new Car(this);
    }




}
