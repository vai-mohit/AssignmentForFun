package org.spring2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionTest {
	@Test
	public void toStringTest() {
		ApplicationContext c1 =  new ClassPathXmlApplicationContext("spring_config.xml");
		Question q1 = (Question) c1.getBean("question");
		assertEquals("1 Three Examples of some alphabets [\"A\", \"B\", \"C\"] \"A\" \"B\" \"C\"  [\"A\", \"B\", \"C\"] {1=A, 2=B, 3=C}",q1.toString());
	}
}
