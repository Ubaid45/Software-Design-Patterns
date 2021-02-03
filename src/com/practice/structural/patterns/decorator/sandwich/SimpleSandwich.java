package com.practice.structural.patterns.decorator.sandwich;

public class SimpleSandwich implements Sandwich{
    @Override
    public String make() {
        return "Bread";
    }
}
