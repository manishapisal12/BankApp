package com.mastek.bankapp.model;

import java.util.ArrayList;
import java.util.List;

import com.mastek.bankapp.model.util.InvalidAccNoException;

public class BankAccountList {

	private List<BankAccount> accountList;
	
	public BankAccountList() {
		super();
		this.accountList = new ArrayList<>();
	}
	
	public int totalAccounts() {
		return accountList.size();
	}
	public String createAccount(BankAccount account) {
		this.accountList.add(account);
		return account.getAccNo()+" Created";
	} 
	

	public String closeAccount(int accNo) {
		try {
			BankAccount account=find(accNo);
			this.accountList.remove(account);
		} catch (InvalidAccNoException e) {
			return e.getMessage();
		}
		return accNo+" is closed now.";
	}

	private BankAccount find(int accNo) throws InvalidAccNoException {
		
		for(BankAccount account: this.accountList) {
			if(account.getAccNo()==accNo) {
				return account;
			}
		}
		throw new InvalidAccNoException("InValid Account Number");
	} 

	public void displayAllAccountDetails() {
		for(BankAccount account: this.accountList) {
			System.out.println(account);
		}
	}
}
