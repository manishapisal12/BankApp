package com.mastek.paytm.model;

import com.mastek.bankapp.model.IBankService;

public class PayTmAccount {

	private IBankService payer;

	public PayTmAccount(IBankService account) {
		super();
		this.payer = account;
	}

	public String payToAccount(IBankService payee, double amount) {

		try {
//			1. withdraw amount from account
			payer.withdraw(amount);
//			2. deposit amount to account2
			payee.deposite(amount);
		} catch (Exception e) {
			return "Transaction Failed. Due to " + e.getMessage();
		}

		return "Transaction Successful";
	}

}
