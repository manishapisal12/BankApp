package com.mastek.bankapp.model;

import com.mastek.bankapp.util.InsufficientBalanceException;

public class SalaryAccount extends SavingAccount {

	public SalaryAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaryAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double withdraw(double amount) throws InsufficientBalanceException {
		final double diff=this.getBalance()-amount;
		if(diff>=0) {
			this.setBalance(diff);
			return this.getBalance();
		}
		throw new InsufficientBalanceException("Insufficient Balnace!");
	}
}
