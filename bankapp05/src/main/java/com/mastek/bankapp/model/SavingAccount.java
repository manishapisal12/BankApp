package com.mastek.bankapp.model;

public class SavingAccount extends BankAccount {

	

	public SavingAccount() {
//		super();
		System.out.println("SavingAccount()");
	}

	public SavingAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
		System.out.println("SavingAccount(accNo, accName, balance)");
	}

	static {
		System.out.println("Static/ class per block - SavingAccount ");
	}
	
	//init block -> non-static init block 
	{
		System.out.println("Non-Static/ instance specific block  - SavingAccount ");
	}
	
	public void customMethod() {
		System.out.println("Doing something ......");
	}
	
	
	public double withdraw(double amount) {
		System.out.println("SavigAccount Withdraw method called: ");
		double diff=getBalance()-amount;
		if(diff>10000) {
//			this.balance = diff;
			setBalance(diff);
		}else {
			System.out.println("No suffient balance");
		}
		return getBalance();
	}

}
