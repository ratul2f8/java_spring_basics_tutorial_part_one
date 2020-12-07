package com.example.utilityclasses;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
/*
you can call the lifecycle triggers by implementing interfaces in this way
* public class TriangleSix implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean...init method called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying the bean");
    }
}

*
*
* */

public class TriangleSix{
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
    public void myInit(){
        System.out.println("Initializing Bean...init method called");
    }
    public void onDestroy(){
        System.out.println("Destroying the bean");
    }
}


