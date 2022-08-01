package com.ust.javapractice.DesignPatterns.FactoryMethod;

public class FactoryMain {
    public static void main(String[] args) {
        Restaurant beefResto = new BeefBurgerRestaurant();
        Burger beefBurger = beefResto.orderBurger();

        Restaurant veggieResto = new BeefBurgerRestaurant();
        Burger veggieBurger = veggieResto.orderBurger();
    }
}
