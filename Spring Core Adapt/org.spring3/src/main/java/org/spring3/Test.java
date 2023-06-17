package org.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
		BankAccountController bankAccountController = (BankAccountController)context.getBean("bankAccountController");
		System.out.println(bankAccountController);
		System.out.println(bankAccountController.withdraw(1, 1000));
		System.out.println(bankAccountController.deposit(1, 1000));
		System.out.println(bankAccountController.getBalance(1));
		System.out.println(bankAccountController.fundTransfer(1, 2, 100));

	}

}
