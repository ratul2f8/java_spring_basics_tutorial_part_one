package com.example.springdemo;

import com.example.utilityclasses.TriangleFour;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//initializing collections
public class TutFour {
    public static void main(String[] args){
        ApplicationContext context  = new ClassPathXmlApplicationContext("springFour.xml");
        TriangleFour triangle = (TriangleFour) context.getBean("triangleFour");
        triangle.draw();
    }
}
