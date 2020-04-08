package com.practice.structural.patterns.flyweight;

public class PointIcon {
    private PointType type;
    private byte[] icon;

    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }

    public PointType getType() {
        return type;
    }
}
