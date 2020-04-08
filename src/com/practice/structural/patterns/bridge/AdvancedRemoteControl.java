package com.practice.structural.patterns.bridge;

public class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void setChannels(int number){
        device.setChannels(number);
    }
}
