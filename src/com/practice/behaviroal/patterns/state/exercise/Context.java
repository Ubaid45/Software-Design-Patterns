package com.practice.behaviroal.patterns.state.exercise;


public class Context {
    private Travel travelType;

    public void CalculateDirection() {
        travelType.CalculateDirection();
    }

    public void CalculateETA() {
        travelType.CalculateETA();
    }

    public Travel getTravelType() {
        return travelType;
    }

    public void setTravelType(Travel travelType) {
        this.travelType = travelType;
    }
}
