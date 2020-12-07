package com.example.utilityclasses;

import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CircleNineRequiredAnnot implements ShapeEight {
    private double radius;

    public double getRadius() {
        return radius;
    }
    //the annotation, Required can catch any kind of dependency related errors
    //while the system initializes instead of catching error in
    //actual runtime
    @Required
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void draw(){
        System.out.println("Circle Drawn with radius of " + this.radius);
    }
}
