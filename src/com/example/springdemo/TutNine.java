package com.example.springdemo;

import com.example.utilityclasses.CircleNineAutowired;
import com.example.utilityclasses.CircleNineRequiredAnnot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TutNine {
    public static void main(String[] args) {
        //annotations in spring
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springNine.xml");
        context.registerShutdownHook();
        //testing the @Required annotation -> observe the springNine.xml file
        CircleNineRequiredAnnot circleNine = (CircleNineRequiredAnnot) context.getBean("circle");
        circleNine.draw();
        //AutoWired annotation
        //Observe -> springNine.xml CircleNineAutowired.java
        CircleNineAutowired circleNineAutowired = (CircleNineAutowired) context.getBean("center");
        circleNineAutowired.draw();
    }
}
