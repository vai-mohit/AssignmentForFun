package org.spring5;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.spring5")
public class Spring_Annotation_Scan {
	@Bean
	public BankAccount bankAccount1() {
		return new BankAccount(1,"Mohit","Savings",1000000);
	}
	@Bean
	public BankAccount bankAccount2() {
		return new BankAccount(2,"Mohit","Current",3000000);
	}
	@Bean
	public ArrayList<BankAccount> repo(){
		ArrayList<BankAccount> tempList = new ArrayList<>();
		tempList.add(bankAccount1());
		tempList.add(bankAccount2());
		return tempList;
	}
}
