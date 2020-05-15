package com.mastek.bankapp.util;

import com.mastek.bankapp.model.BankAccount;

public class Transaction implements Runnable{
	
	private BankAccount account;
	private double amount;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(BankAccount account,double amount) {
		super();
		this.account = account;
		this.amount=amount;
	}
	
	public void run() {
		
		account.deposit(amount);
		
	}
	
	
}
