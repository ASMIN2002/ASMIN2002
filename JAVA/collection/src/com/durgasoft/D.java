package com.durgasoft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class D {

	public static void main(String[] args) {
		Collection collection = new ArrayList();
		collection.add("AAA");
		collection.add("BBB");
		collection.add("CCC");
		collection.add("DDD");
		System.out.println(collection);   		// [AAA,BBB,CCC,DDD] 
		
		List list = new ArrayList();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		list.add("EEE");
		list.add("FFF");
		System.out.println(list);							// [AAA,BBB,CCC,DDD,EEE,FFF]
		System.out.println(list.removeAll(collection));		// true
		System.out.println(list);							// [EEE,FFF]
		System.out.println(list.removeAll(collection));		// false
		
	}

}
