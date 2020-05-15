package com.mastek.thread;

import com.mastek.bankapp.model.BankAccount;
import com.mastek.bankapp.util.Transaction;
import com.mastek.hotel.Eater;
import com.mastek.hotel.MenuItem;
import com.mastek.hotel.Waiter;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		transactionDemo();
		
		MenuItem<String> menuItem=new MenuItem<String>();
		menuItem.add("Idli");
		menuItem.add("Vada");
		menuItem.add("Samosa");
		
		Waiter waiter =new Waiter(menuItem);
		Eater eater=new Eater(menuItem);
		waiter.start();
		eater.start();
		
	}

	private static void transactionDemo() {
		final BankAccount account = new BankAccount(1001, "aditi", 5000);
		System.out.println(account);
		Transaction transaction1 = new Transaction(account, 10000);
		Transaction transaction2 = new Transaction(account, 10000);
		Transaction transaction3 = new Transaction(account, 10000);
		Thread th1 = new Thread(transaction1);
		Thread th2 = new Thread(transaction2);
		Thread th3 = new Thread(transaction3);

		th1.start();
		th2.start();
		th3.start();
		
		System.out.println(account);
	}
}
