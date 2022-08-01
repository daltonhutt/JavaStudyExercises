package com.ust.javapractice.DesignPatterns.AbstractFactory;

public abstract class Company {

    public abstract Monitor createMonitor();
    public abstract Gpu createGpu();
}
