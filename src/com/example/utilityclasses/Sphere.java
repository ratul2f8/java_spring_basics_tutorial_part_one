package com.example.utilityclasses;

public class Sphere implements ShapeEight{
    private double depth;

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public void draw(){
        System.out.println("Sphere with depth, " + this.depth + " drawn!");
    }
}
