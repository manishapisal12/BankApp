package com.mastek.hotel;

public class Waiter extends Thread {

	private MenuItem<String> menuItem;
	
	
	public Waiter(MenuItem<String> menuItem) {
		super();
		this.menuItem = menuItem;
	}


	@Override
	public void run() {
		for(int i=0;i<menuItem.getSize();i++) {
			menuItem.serve(i);	
		}
		
	}
}
