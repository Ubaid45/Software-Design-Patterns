package com.practice.creational.patterns.factory.dressing;

public class Casual extends Dressing {

    @Override
    public void Shoes() {
        System.out.println("Informal shoes");
    }

    @Override
    public void Pants() {
        System.out.println("Trousers");
    }

    @Override
    public void Shirt() {
        System.out.println("T-shirt");
    }
}
