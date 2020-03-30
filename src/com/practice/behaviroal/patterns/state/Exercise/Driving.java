package com.practice.behaviroal.patterns.state.Exercise;

public class Driving implements Travel {
    @Override
    public Object CalculateETA() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Object CalculateDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
