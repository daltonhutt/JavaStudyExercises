package com.ust.javapractice.DesignPatterns.Prototype;

public class Bus extends Vehicle{
    private int seats;

    public Bus() {
        super();
    }

    public Bus(Bus bus) {
        super(bus);
        this.seats = bus.seats;
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }


}
