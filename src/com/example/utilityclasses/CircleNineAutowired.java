package com.example.utilityclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CircleNineAutowired implements ShapeEight {
    private PointTwo point;

    public PointTwo getPoint() {
        return point;
    }
    @Autowired
    public void setPoint(PointTwo point) {
        this.point = point;
    }
    public void draw(){
        System.out.println("Circle with center, (" + point.getX() + "," + point.getY() + ") drawn!");
    }

}
