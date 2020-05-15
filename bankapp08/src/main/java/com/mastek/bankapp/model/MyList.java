package com.mastek.bankapp.model;

import java.util.ArrayList;
import java.util.List;

public abstract class MyList<T, K> {

	private List<T> dataList;
	public MyList() {
		super();
		dataList=new ArrayList<T>();
	}

	//1. add element/ data to your data list
	public String addData(T t) {
		dataList.add(t);
		return t+" added to Data List";
	}
//	//2. remove
//		public String removeData(K key) {
//			T t=find(key);
//			dataList.remove(t);
//			return t+" removed from list";
//		}
//
//	abstract String find(K key);
}
