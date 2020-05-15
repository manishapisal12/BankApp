package com.mastek.bankapp.model;

import com.mastek.bankapp.util.InsufficientBalanceException;

public class SavingAccount extends BankAccount {

	private static final double MIN_BAL=10000;

	
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
		// TODO Auto-generated constructor stub
	}

	public double deposite(double amount) {
		this.setBalance(this.getBalance()+amount);
		return this.getBalance();
	}

	public double withdraw(double amount) throws InsufficientBalanceException {
		final double diff=this.getBalance()-amount;
		if(diff>=MIN_BAL) {
			this.setBalance(diff);
			return this.getBalance();
		}
		throw new InsufficientBalanceException("Insufficient Balance!");
	}

}
