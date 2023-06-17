package org.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =  new ClassPathXmlApplicationContext("spring_config.xml");
		Customer c1 = (Customer)context.getBean("customer");
		System.out.println(c1);
		Customer c2 = (Customer)context.getBean("customer2");
		System.out.println(c2);
	}

}
