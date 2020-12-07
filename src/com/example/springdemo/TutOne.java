package com.example.springdemo;

import com.example.utilityclasses.Book;
import com.example.utilityclasses.Triangle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TutOne {
    public static void main(String[] args){
        //Using bean factory follow the spring.xml file to get the beans
        //***********using the spring.xml file in SpringDemo root Directory*************
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Triangle triangle = (Triangle) factory.getBean("triangle");
        triangle.Draw();
        System.out.println("Type of triangle created by BeanFactory is  : " + triangle.getType());
        //Using Application Context
        //********* it is tracing the spring.xml file in src directory*******
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle1 = (Triangle) context.getBean("triangle");
        triangle1.Draw();
        System.out.println("Type of triangle created by Application Context is  : " + triangle1.getType());
        //using the constructor injection: follow the spring.xml file under root directory
        Book book = (Book) factory.getBean("book");
        System.out.println("The book," + book.getName() + " is type of " + book.getType());
    }
}
