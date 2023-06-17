package org.spring4;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class BankAccountepositoryImpl implements BankAccountRepository {
	
	@Autowired
	@Qualifier("repo")
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
