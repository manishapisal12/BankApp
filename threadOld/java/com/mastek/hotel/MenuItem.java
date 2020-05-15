package com.mastek.hotel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class MenuItem<T> {

	private List<T> list = new ArrayList<>();
	private int size;
	private boolean isServe;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public MenuItem() {
		super();
	}

	public synchronized void eat(int i) {
		try {
			if (isServe) {
				System.out.println("Ate " + list.get(i));
				isServe = false;
				notify();
			} else {
				wait();
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void serve(int i) {
		try {
			if (!isServe) {
				System.out.println(" Served " + list.get(i));
				isServe = true;
				notify();
			} else {
				wait();
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void add(T t) {
		list.add(t);
		this.size = list.size();
	}
}
