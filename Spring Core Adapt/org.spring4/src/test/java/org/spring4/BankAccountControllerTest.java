package org.spring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountControllerTest {
	ApplicationContext context = new AnnotationConfigApplicationContext(Spring_Annotation_Scan.class);
	BankAccountController bankAccountController = (BankAccountController)context.getBean("bankAccountController");
	@Test
	public void withdrawTest() {
		assertEquals(999000.0,bankAccountController.withdraw(1,1000));
	}

	@Test
	public void depositTest() {
		assertEquals(1001000.0,bankAccountController.deposit(1, 1000));
	}
	@Test
	public void getBalanceTest() {
		assertEquals(1000000.0,bankAccountController.getBalance(1));
	}
	@Test
	public void fundTransferTest() {
		assertEquals(true,bankAccountController.fundTransfer(1, 2, 100));
	}
	
	}
