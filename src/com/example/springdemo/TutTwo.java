package com.example.springdemo;

import com.example.utilityclasses.TriangleTwo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Injecting Objects
public class TutTwo {
    public static  void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("springTwo.xml");
        TriangleTwo triangleTwo = (TriangleTwo) context.getBean("triangleTwo");
        triangleTwo.draw();
    }
}
