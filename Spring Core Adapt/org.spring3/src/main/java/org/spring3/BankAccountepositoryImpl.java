package org.spring3;

import java.util.ArrayList;

public class BankAccountepositoryImpl implements BankAccountRepository {
	
	private ArrayList<BankAccount> repo = new ArrayList<>();
	@Override
	public String toString() {
		return "BankAccountepositoryImpl [repo=" + repo + "]";
	}

	public ArrayList<BankAccount> getRepo() {
		return repo;
	}

	public void setRepo(ArrayList<BankAccount> repo) {
		this.repo = repo;
	}


	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		for(BankAccount temp:repo)
			if(temp.getAccountId()==accountId)
				return temp.getAccountBalance();
		return -1;
	}

	public double updateBalance(long accountId, double newBalance) {
		// TODO Auto-generated method stub
		for(BankAccount temp:repo) {
			if(temp.getAccountId()==accountId) {
				temp.setAccountBalance(newBalance);
				return newBalance;
			}
		}
		return -1;
	}

}
