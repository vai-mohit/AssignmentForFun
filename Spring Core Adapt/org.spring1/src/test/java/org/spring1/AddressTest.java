package org.spring1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AddressTest {
	@Test
	public void toStringTest() {
		ApplicationContext context =  new ClassPathXmlApplicationContext("spring_config.xml");
		Address a1 = (Address)context.getBean("address");
		assertEquals("Saket Indore Madhya Pradesh 452010 India",a1.toString());
	}
}