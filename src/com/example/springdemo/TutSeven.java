package com.example.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TutSeven {
    public static void main(String[] args) {
        //writing a bean post processor
        //observe the Utility Class BeanPostProcessorDisplayName
        //observe the xml file under the src directory named as springSeven.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("springSeven.xml");
        //writing a bean factory post processor
        //observe the utility class MyBeanFactoryPostProcessor

    }
}
