package com.example.springdemo;

import com.example.utilityclasses.TriangleTwo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//inner beans, aliases
//main changes are done within the springThree.xml file compared to springTwo.xml
public class TutThree {
    public  static  void  main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("springThree.xml");
        TriangleTwo triangle = (TriangleTwo) context.getBean("triangle-alias");
        triangle.draw();
    }
}
