package com.practice.structural.patterns.bridge;

public class SamsungTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Samsung TV: On");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung TV: Off");
    }

    @Override
    public void setChannels(int number) {
        System.out.println("Samsung TV: Set channels = " + number);
    }
}
