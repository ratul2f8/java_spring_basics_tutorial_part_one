package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component
class MessageDemo{

    @Autowired
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
}
public class TutTwelve {
    //Using Message Source To Get Text from Property Files
    //Obeserve -> springTwelve.xml
    //Observe -> myMessages.properties
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("springTwelve.xml");
        System.out.println(context.getMessage("greetings", null, "Default Greeting", null));
        //because the bean with the id of: messageSource, implements the MessageSource interface
        //for communication
        MessageDemo messageDemo = (MessageDemo) context.getBean("messageDemo");
        System.out.println(messageDemo.getMessageSource());
        System.out.println(messageDemo.getMessageSource().getMessage("greetings", null, "Default Greeting", null));
        System.out.println(messageDemo.getMessageSource().getMessage("drawing.circle", new Object[] {12, 15}, "Default Greeting", null));
    }
}
