package com.example.utilityclasses;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDisplayName implements BeanPostProcessor {
    //will be called after creating each and every bean
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In before initialization method, Bean name is : " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In after initialization method, Bean name is : " + beanName);
        return bean;
    }
}
