package com.example.springdemo;


import com.example.utilityclasses.CircleTen;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TutTen {
    //JSR 250 standard annotations
    //Observe -> CircleTen
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springTen.xml");
        context.registerShutdownHook();

        CircleTen circleTen = (CircleTen) context.getBean("center");
        circleTen.draw();
    }
}
