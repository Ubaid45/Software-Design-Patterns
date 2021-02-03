package com.practice.structural.patterns.decorator.sandwich;

public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich sandwich){
        this.customSandwich = sandwich;
    }
    @Override
    public String make() {
        return customSandwich.make();
    }
}
