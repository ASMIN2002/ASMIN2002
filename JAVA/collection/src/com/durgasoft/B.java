package com.durgasoft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class B{

	public static void main(String[] args) {
		Collection collection = new ArrayList();
		collection.add("AAA");
		collection.add("BBB");
		collection.add("CCC");
		collection.add("DDD");
		
		System.out.println(collection);
		
		HashSet hashSet = new HashSet();
		System.out.println(hashSet.addAll(collection)); //true
		System.out.println(hashSet.addAll(collection)); //false
		System.out.println(hashSet);
	}
}
 