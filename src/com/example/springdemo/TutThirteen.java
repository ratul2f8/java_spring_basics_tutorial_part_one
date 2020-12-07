package com.example.springdemo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
class DrawEvent extends ApplicationEvent{
    public DrawEvent(Object source){
        super(source);
    }
    public String toString(){
        return "Drawn Method Called!";
    }
}
@Component
class MyEventListener implements ApplicationListener, ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        System.out.println(event.toString());
    }
    public void draw(){
        DrawEvent drawEvent = new DrawEvent(this);
        this.publisher.publishEvent(drawEvent);
    }
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
public class TutThirteen {
    //Event handling in spring
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springThirteen.xml");
        context.registerShutdownHook();
        MyEventListener listener = (MyEventListener) context.getBean("myEventListener");
        listener.draw();

    }
}
