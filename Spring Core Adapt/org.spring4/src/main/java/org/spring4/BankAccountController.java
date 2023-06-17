package org.spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BankAccountController {
	private BankAccountServiceImpl service ;
	@Autowired
	public BankAccountController(BankAccountServiceImpl service) {
		this.service = service;
	}
	public BankAccountServiceImpl getService() {
		return service;
	}
	public void setService(BankAccountServiceImpl service) {
		this.service = service;
	}
	public double withdraw(long accountId, double balance) {
		return service.withdraw(accountId, balance);
	}
	public double deposit(long accountId, double balance) {
		return service.deposit(accountId, balance);
	}
	public double getBalance(long accountId) {
		return service.getBalance(accountId);
	}
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		return service.fundTransfer(fromAccount, toAccount, amont);
	}
	@Override
	public String toString() {
		return "BankAccountController [service=" + service + "]";
	}
	
	
}
