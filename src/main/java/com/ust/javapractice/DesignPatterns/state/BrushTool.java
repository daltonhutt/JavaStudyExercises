package com.ust.javapractice.DesignPatterns.state;

public class BrushTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Brush something");
    }
}
