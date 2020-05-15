package com.mastek.bankapp;

import com.mastek.bankapp.model.IBankService;
import com.mastek.bankapp.model.SavingAccount;
import com.mastek.paytm.model.PayTmAccount;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args)  {

//		BankAccount account=new SavingAccount(1001,"Aditi",20000.00);
//		System.out.println(account);
//		try {
//			System.out.println(account.withdraw(10000));
//		} catch (Exception e) {
//			System.out.println(account.getAccNo()+" "+e.getMessage());
//		}
//		
//		account=new SalaryAccount(1002,"Aditi",20000.00);
//		System.out.println(account);
//		try {
//			System.out.println(account.withdraw(20000));
//		} catch (Exception e) {
//			System.out.println(account.getAccNo()+" "+e.getMessage());
//		}
		
		//1. Payee Account
		IBankService payee=new SavingAccount(10001, "Karuna", 10000000.00);
		//2. Payer Account
		IBankService payer=new SavingAccount(10002, "Manisha", 10000000.00);
		//3. Paytm account for payer
		PayTmAccount payTmAccount=new PayTmAccount(payer);
		//4. we will do the transfer
		System.out.println(payTmAccount.payToAccount(payee, 100000));
		
	}
}
