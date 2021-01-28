package com.practice.creational.patterns.factory.dressing;

public class Formal extends Dressing{
    @Override
    public void Shoes() {
        System.out.println("Dress shoes");
    }

    @Override
    public void Pants() {
        System.out.println("Dress pants");
    }

    @Override
    public void Shirt() {
        System.out.println("Dress shirt");
    }
}
