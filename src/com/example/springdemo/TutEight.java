package com.example.springdemo;

import com.example.utilityclasses.ShapeEight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Using interfaces in bean
public class TutEight {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springEight.xml");
        ShapeEight circle = (ShapeEight) context.getBean("circle");
        circle.draw();
        ShapeEight sphere = (ShapeEight) context.getBean("sphere");
        sphere.draw();
    }
}
