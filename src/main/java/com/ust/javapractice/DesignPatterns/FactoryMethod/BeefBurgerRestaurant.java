package com.ust.javapractice.DesignPatterns.FactoryMethod;

public class BeefBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
