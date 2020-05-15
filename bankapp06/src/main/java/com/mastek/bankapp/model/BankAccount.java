package com.mastek.bankapp.model;

import com.mastek.bankapp.util.InsufficientBalanceException;

public abstract class BankAccount {

	private int accNo;
	private String accName;
	private double balance;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accNo, String accName, double balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
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
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
	}
	
	public double deposit(double amount) {
		this.balance=this.balance+amount;
		return this.balance;
	}
	
	public abstract double withdraw(double amount) throws Exception;
}
