package com.practice.behaviroal.patterns.state.Exercise;

public class Transit implements Travel {
    @Override
    public Object CalculateETA() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Object CalculateDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
