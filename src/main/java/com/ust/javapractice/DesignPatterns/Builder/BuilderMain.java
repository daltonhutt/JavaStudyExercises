package com.ust.javapractice.DesignPatterns.Builder;

public class BuilderMain {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.buildBugatti(builder);
        Car car = builder.build();

    }
}
