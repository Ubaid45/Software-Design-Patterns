package com.practice.structural.patterns.decorator.sandwich;

public class MeatDecorator extends SandwichDecorator{

    public MeatDecorator(Sandwich sandwich){
        super(sandwich);
    }
    public String addMeat(){
        return " meat";
    }

    @Override
    public String make() {
        return customSandwich.make() + addMeat();
    }
}
