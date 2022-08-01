package com.ust.javapractice.DesignPatterns.FactoryMethod;

public class SimpleBurgerFactory {
    public Burger createBurger(String request) {
        Burger burger = null;
        if ("BEEF".equals(request)) {
            burger = new BeefBurger();
        } else if ("VEGGIE".equals(request))  {
            burger = new VeggieBurger();
        }
        return burger;
    }
}
