package org.spring6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(PrintProperties.class);
        PrintProperties p1 = context.getBean(PrintProperties.class);
        p1.displayProperties();
	}

}
