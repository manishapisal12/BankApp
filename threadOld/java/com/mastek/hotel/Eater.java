package com.mastek.hotel;

public class Eater extends Thread {

	private MenuItem<String> menuItem;
	
	public Eater(MenuItem<String> menuItem) {
		super();
		this.menuItem = menuItem;
	}

	@Override
	public void run() {
		for(int i=0;i<menuItem.getSize();i++) {
			menuItem.eat(i);	
		}
	}
}
