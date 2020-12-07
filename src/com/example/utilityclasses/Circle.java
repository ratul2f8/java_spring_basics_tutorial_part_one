package com.example.utilityclasses;

public class Circle implements ShapeEight{
    private double radius;
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return  this.radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle with radius, " + this.radius + " drawn");
    }
}
