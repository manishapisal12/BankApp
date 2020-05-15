package com.mastek.bankapp.model;

import com.mastek.bankapp.model.util.MaintainMinBalException;

public class SavingAccount extends BankAccount {

	private static final double MIN_BAL=1000;
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String deposit(double amount) {
		this.setBalance(this.getBalance()+amount);
		return amount+" deposited. Current balance is "+this.getBalance();
	}

	@Override
	public String withdraw(double amount) throws MaintainMinBalException {
		final double diff=this.getBalance()-amount;
		if(diff>=MIN_BAL) {
			this.setBalance(diff);
			return amount+" credited. Current balance is "+this.getBalance();
		}
		throw new MaintainMinBalException(MIN_BAL+" must be maintained in account. Transaction rejected.");
	}

}
