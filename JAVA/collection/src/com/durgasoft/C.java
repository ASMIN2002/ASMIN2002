package com.durgasoft;

import java.util.ArrayList;
import java.util.Collection;

public class C {

	public static void main(String[] args) {
		Collection collection = new ArrayList();
		collection.add("AAA");
		collection.add("BBB");
		collection.add("CCC");
		collection.add("DDD");
		collection.add("EEE");
		System.out.println(collection);                 // {AAA,BBB,CCC,DDD,EEE}
		System.out.println(collection.remove("EEE"));   // true
		System.out.println(collection);                 // {AAA,BBB,CCC,DDD}
		System.out.println(collection.remove("EEE"));   // false
	}

}
