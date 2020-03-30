package com.practice.behaviroal.patterns.state.Exercise;

public class Bicycle implements Travel {
    @Override
    public Object CalculateETA() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object CalculateDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
