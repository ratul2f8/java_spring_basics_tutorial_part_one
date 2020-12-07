package com.example.springdemo;

import com.example.utilityclasses.CircleEleven;
import com.example.utilityclasses.ShapeEight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TutEleven {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springEleven.xml");
        //name of the bean should be in the camel case
        ShapeEight circle = (ShapeEight) context.getBean("circleEleven");
        circle.draw();
    }
}
