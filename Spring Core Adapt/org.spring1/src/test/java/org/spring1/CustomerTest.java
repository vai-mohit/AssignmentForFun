package org.spring1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CustomerTest {
	@Test
	public void toStringTest() {
		ApplicationContext context =  new ClassPathXmlApplicationContext("spring_config.xml");
		Customer c1 = (Customer)context.getBean("customer");
		assertEquals("1 Mohit 9876543210 Saket Indore Madhya Pradesh 452010 India",c1.toString());
	}
}
