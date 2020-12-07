package com.example.utilityclasses;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class CircleTen {
    private PointTwo point;

    public PointTwo getPoint() {
        return point;
    }
    @Resource(name="pointA")
    public void setPoint(PointTwo point) {
        this.point = point;
    }
    public void draw(){
        System.out.println("Circle with center, (" + point.getX() + "," + point.getY() + ") drawn!");
    }

    @PostConstruct
    public void init(){
        System.out.println("After initialization");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Before Destroy");
    }
}
