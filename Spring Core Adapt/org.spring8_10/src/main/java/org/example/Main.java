package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //BeanFactory fact = new XmlBeanFactory(new FileSystemResource("spring-config.xml"));
        //Triangle tri = (Triangle)fact.getBean("triangle");
        AbstractApplicationContext ap = new ClassPathXmlApplicationContext("spring-config.xml");
        ap.registerShutdownHook();
        Triangle tri = (Triangle)ap.getBean("triangleChild");
        tri.draw();
    }

}