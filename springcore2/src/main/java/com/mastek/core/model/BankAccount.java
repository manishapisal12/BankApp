package com.mastek.core.model;

import javax.print.DocFlavor.STRING;

 

public class BankAccount {

 

    private int accNo;
    private Person person;
    private double balance;
 
	 private BankAccount() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	    private BankAccount(int accNo, Person person, double balance) {
	        super();
	        this.accNo = accNo;
	        this.person = person;
	        this.balance = balance;
	    }
	    public int getAccNo() {
	        return accNo;
	    }
	    public void setAccNo(int accNo) {
	        this.accNo = accNo;
	    }
	    public Person getPerson() {
	        return person;
	    }
	    public void setPerson(Person person) {
	        this.person = person;
	    }
	    public double getBalance() {
	        return balance;
	    }
	    public void setBalance(double balance) {
	        this.balance = balance;
	    }
	    @Override
	    public String toString() {
	        return "BankAccount [accNo=" + accNo + ", person=" + person + ", balance=" + balance + "]";
	    }
	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + accNo;
	        return result;
	    }
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        BankAccount other = (BankAccount) obj;
	        if (accNo != other.accNo)
	            return false;
	        return true;
	    }
	    
	}
	 


