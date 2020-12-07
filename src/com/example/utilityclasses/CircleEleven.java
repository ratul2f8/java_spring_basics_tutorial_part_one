package com.example.utilityclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//now you don't have to create a bean specifically for CircleEleven
//@Service/@Controller/@Repository
@Component
public class CircleEleven implements  ShapeEight{
    private PointTwo point;

    public PointTwo getPoint() {
        return point;
    }
    @Autowired
    public void setPoint(PointTwo point) {
        this.point = point;
    }
    public void draw(){
        System.out.println("Circle drawn with the center of : (" + point.getX() + ","
        + point.getY() + ")");
    }
}
