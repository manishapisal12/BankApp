package com.mastek.thread.pack01;

public class CustomThread extends Thread {

	@Override
	public void run() {
		System.out.println("############### run start #################"+Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("############### run ends #################");
	}
}
