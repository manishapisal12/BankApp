package com.mastek.bankapp01;

public class BankAccount {
	int accNo;
	String accName;
	double balance;
	
public BankAccount()
{
	super();
}
public BankAccount(int accNo,String accName,double balance)
{
 super();
 this.accName=accName;
 this.accNo=accNo;
 this.balance=balance;
 
}
public int getAccNo() {
	return accNo;
}
public void SetAccNo(int accNo) {
	this.accNo=accNo;
}
public String getAccName () {
	return accName;
}
public void setAccName(String accName) {
	this.accName= accName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance=balance;
}
@override
public String toString() {
	return "BankAccount accNo=" + accNo + ",accName="+accName + ",balance=" +balance;
}
}
