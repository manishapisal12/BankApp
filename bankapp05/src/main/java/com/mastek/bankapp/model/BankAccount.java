package com.mastek.bankapp.model;

public class BankAccount {

	private int accNo;
	private String accName;
	private double balance;

	static {
		System.out.println("Static/ class per block - BankAccount");
	}

	// init block -> non-static init block
	{
		System.out.println("Non-Static/ instance specific block - BankAccount");
	}

	public BankAccount() {
		super();
		System.out.println("BankAccount()");
	}

	public BankAccount(int accNo, String accName, double balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
		System.out.println("BankAccount(accNo, accName, balance)");
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
	}

	public double deposit(double amount) {
		this.balance = this.balance + amount;
		return this.balance;
	}

	public double withdraw(double amount) {
		double diff=this.balance-amount;
		if(diff>0) {
			this.balance = diff;
		}else {
			System.out.println("No suffient balance");
		}
		return this.balance;
	}
}
