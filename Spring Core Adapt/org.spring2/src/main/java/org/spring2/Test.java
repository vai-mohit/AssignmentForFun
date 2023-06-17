package org.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c1 =  new ClassPathXmlApplicationContext("spring_config.xml");
		Question q1 = (Question) c1.getBean("question");
		System.out.println(q1);
		
	}

}
