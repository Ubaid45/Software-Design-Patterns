package com.practice.structural.patterns.bridge;

public class SonyTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Sony: Turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: Turn off");
    }

    @Override
    public void setChannels(int number) {
        System.out.println("Sony: Set Channel");
    }
}
