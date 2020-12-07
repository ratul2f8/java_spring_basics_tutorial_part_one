package com.example.springdemo;

import com.example.utilityclasses.TriangleSix;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//LifeCycle Callbacks
public class TutSix {
    public static void main(String[] args) {
        //destroy the application context after terminating the application
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springSix.xml");
        context.registerShutdownHook();
        TriangleSix triangle = (TriangleSix) context.getBean("triangle");
        triangle.draw();
    }
}
