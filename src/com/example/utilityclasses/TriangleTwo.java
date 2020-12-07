package com.example.utilityclasses;

public class TriangleTwo {
   private PointTwo pointA;
   private PointTwo pointB;
   private PointTwo pointC;

    public PointTwo getPointA() {
        return pointA;
    }

    public void setPointA(PointTwo pointA) {
        this.pointA = pointA;
    }

    public PointTwo getPointB() {
        return pointB;
    }

    public void setPointB(PointTwo pointB) {
        this.pointB = pointB;
    }

    public PointTwo getPointC() {
        return pointC;
    }

    public void setPointC(PointTwo pointC) {
        this.pointC = pointC;
    }
    public void draw(){
        System.out.println("Point A = (" + getPointA().getX() + "," + getPointA().getY() + ")");
        System.out.println("Point B = (" + getPointB().getX() + "," + getPointB().getY() + ")");
        System.out.println("Point C = (" +getPointC().getX() + "," + getPointC().getY() + ")");
    }
}
