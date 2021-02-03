package com.practice.structural.patterns.decorator.sandwich;

public class DressingDecorator extends SandwichDecorator{

    public DressingDecorator(Sandwich sandwich){
        super(sandwich);
    }

    public String make(){
        return customSandwich.make() + addDressing();
    }

    public String addDressing(){
        return " Mayo Avacado";
    }
}
