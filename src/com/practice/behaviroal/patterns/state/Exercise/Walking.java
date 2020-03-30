package com.practice.behaviroal.patterns.state.Exercise;

public class Walking implements Travel {
    @Override
    public Object CalculateETA() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object CalculateDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
