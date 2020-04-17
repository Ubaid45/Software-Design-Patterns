package com.practice.structural.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory iconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }

    public List<Point> getPoints(){
        var points = new ArrayList<Point>();
        var point = new Point(1,2, iconFactory.getPointIcon(PointType.CAFE));
        points.add(point);
        return points;
    }
}git push origin