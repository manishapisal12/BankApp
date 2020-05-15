package com.mastek.bankapp;

import com.mastek.bankapp.model.BankAccount;
import com.mastek.bankapp.model.SavingAccount;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args)  {
//    	BankAccount account2=new BankAccount(1001,"Amit",20000.00) {
//    		
//    		@Override
//    		public double withdraw(double amount) {
//    			final double diff=this.getBalance()-amount;
//    			if(diff>=0) {
//    				this.setBalance(diff);
//    			}
//    			return this.getBalance();
//    		}
//    	};
//    	System.out.println("before "+account2.getBalance());
//    	System.out.println("After "+account2.withdraw(20001));	

		BankAccount account1 = new SavingAccount(1001, "Ajit", 200000.00);
		System.out.println(account1);
		try {
			System.out.println("Current Balance "+account1.withdraw(189999));
			System.out.println("Current Balance "+account1.withdraw(10000));
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage()+"\nCurrent balance is "+account1.getBalance());
		}

	}
}
