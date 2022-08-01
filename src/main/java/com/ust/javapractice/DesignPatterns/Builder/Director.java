package com.ust.javapractice.DesignPatterns.Builder;

public class Director {
    public void buildBugatti(CarBuilder builder) {
        builder.brand("Bugatti")
                .color("Blue")
                .nbrDoors(2)
                .engine("8L")
                .height(115);
    }
    public void buildLambo(CarBuilder builder) {
        builder.brand("Lamborghini")
                .model("Aventador")
                .color("Yellow")
                .nbrDoors(2)
                .height(115);
    }
}
