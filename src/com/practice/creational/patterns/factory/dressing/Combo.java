package com.practice.creational.patterns.factory.dressing;

public class Combo extends Dressing{
    @Override
    public void Shoes() {
        System.out.println("Joggers");
    }

    @Override
    public void Pants() {
        System.out.println("Jeans");
    }

    @Override
    public void Shirt() {
        System.out.println("Nice dress shirt");
    }
}
