package com.example.springdemo;

import com.example.utilityclasses.TriangleFour;
import com.example.utilityclasses.TriangleTwo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//autowiring, Bean inheritance

public class TutFive {
    public static void main(String[] args) {
        //observe the springFive.xml

        //If name of the properties of the class is same as the id of the bean
        //then, we can autowire the beans with the property
        //observe the springFive.xml file to see the implementations
        //same logic goes for the autowire by type and autowire by constructor also
        //if you have ony one property to initialize you can autowire it with the beans according to the particular type
        //similarly autowire by constructor will work based on the parameters, the constructor receives
        ApplicationContext context = new ClassPathXmlApplicationContext("springFive.xml");
        TriangleTwo triangleTwo = (TriangleTwo) context.getBean("triangleTwo");
        triangleTwo.draw();
        System.out.println();
        //Bean Inheritance : Observe the springFiveAppend.xml file
        ApplicationContext context1 = new ClassPathXmlApplicationContext("springFiveAppend.xml");
        TriangleTwo triangle = (TriangleTwo) context1.getBean("childrenTriangle");
        triangle.draw();
        System.out.println();
        //Bean Inheritance : Inheriting/Merging List
        //if you put the tag :  abstract = true, then you can use the bean as a template instead of initializing
        //the bean for primary use
        TriangleFour triangleFour = (TriangleFour) context1.getBean("childrenListTriangle");
        triangleFour.draw();
    }
}
