package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
// <bean class="org.example.DisplayNameBeanProcessor" /> wrote this in config for bean to know this
public class DisplayNameBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In After Initialization" +  beanName);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In Before Initialization" +  beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}
