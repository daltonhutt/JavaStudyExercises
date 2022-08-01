package com.ust.javapractice.DesignPatterns.AbstractFactory;

public class AsusManufacturer extends Company {
    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }
}
