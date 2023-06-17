package org.spring4;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Spring_Annotation_Scan.class);
		BankAccountController bankAccountController = (BankAccountController)context.getBean("bankAccountController");
		System.out.println(bankAccountController);
		System.out.println(bankAccountController.withdraw(1, 1000));
		System.out.println(bankAccountController.deposit(1, 1000));
		System.out.println(bankAccountController.getBalance(1));
		System.out.println(bankAccountController.fundTransfer(1, 2, 100));

	}

}
