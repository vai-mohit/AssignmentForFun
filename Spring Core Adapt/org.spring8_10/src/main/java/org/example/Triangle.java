package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class Triangle implements ApplicationContextAware, BeanNameAware , InitializingBean , DisposableBean {
    private Point p1;
    private Point p2;
    private Point p3;
    ApplicationContext context = null;

    List<Point> l1 = new ArrayList<>();

    public List<Point> getL1() {
        return l1;
    }

    public void setL1(List<Point> l1) {
        this.l1 = l1;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public void draw() {
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        for(Point a: l1){
            System.out.println(a);
        }
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Beans init");
    }
    @PostConstruct
    public void intIt(){
        System.out.println("Initilization");
    }
    // not work when scope="prototype"
    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Beans destroy");
    }
    @PreDestroy
    public void myDestroy(){
        System.out.println("Destroy");
    }
}
