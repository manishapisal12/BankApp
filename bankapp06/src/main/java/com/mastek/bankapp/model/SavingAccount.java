package com.mastek.bankapp.model;

import com.mastek.bankapp.util.InsufficientBalanceException;

public class SavingAccount extends BankAccount {

	private static final double MIN_BAL = 10000.00;

	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);

	}

	@Override
	public double withdraw(double amount) throws InsufficientBalanceException  {
		double diff = this.getBalance() - amount;
		if (diff > MIN_BAL) {
			this.setBalance(diff);
		} else {
			//System.out.println("Insuffcient Balance");
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		return this.getBalance();
	}

}
