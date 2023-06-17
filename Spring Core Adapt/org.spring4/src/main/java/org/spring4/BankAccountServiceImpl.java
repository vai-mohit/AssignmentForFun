package org.spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService  {
	
	@Autowired
	BankAccountepositoryImpl repoFinal;
	public BankAccountepositoryImpl getRepo() {
		return repoFinal;
	}

	@Override
	public String toString() {
		return "BankAccountServiceImpl [repoFinal=" + repoFinal + "]";
	}

	public void setRepo(BankAccountepositoryImpl repoFinal) {
		this.repoFinal = repoFinal;
	}

	public double withdraw(long accountId, double balance) {
		// TODO Auto-generated method stub
		for(BankAccount temp : repoFinal.getRepo()) {
			if(temp.getAccountId() == accountId) {
				return repoFinal.updateBalance(accountId,temp.getAccountBalance()- balance);
			}
		}
		return -1;
	}

	public double deposit(long accountId, double balance) {
		// TODO Auto-generated method stub
		for(BankAccount temp : repoFinal.getRepo()) {
			if(temp.getAccountId() == accountId) {
				return repoFinal.updateBalance(accountId,temp.getAccountBalance()+ balance);
			}
		}
		return -1;
		
	}

	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return repoFinal.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		// TODO Auto-generated method stub
		for(BankAccount temp : repoFinal.getRepo()) {
			if(temp.getAccountId() == fromAccount) {
				for(BankAccount temp2 : repoFinal.getRepo()){
					if(temp2.getAccountId() == toAccount) {
						withdraw(fromAccount, amont);
					    deposit(toAccount, amont);
						return true;
					}
				}
			}
		}
		
		return false;
	}

}
