package com.example.utilityclasses;

import java.util.List;
//initializing collections using the bean factory
public class TriangleFour {
    private List<PointTwo> points;

    public List<PointTwo> getPoints() {
        return points;
    }

    public void setPoints(List<PointTwo> points) {
        this.points = points;
    }
    public void draw(){
        for (PointTwo point : points){
            System.out.println("Point : (" + point.getX() + "," + point.getY() + ")");
        }
    }
}
