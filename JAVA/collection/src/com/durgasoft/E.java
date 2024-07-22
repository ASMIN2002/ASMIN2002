package com.durgasoft;

import java.util.ArrayList;
import java.util.Collection;

public class E {

	public static void main(String[] args) {
		Collection collection = new ArrayList();
		collection.add("AAA");
		collection.add("BBB");
		collection.add("CCC");
		collection.add("DDD");
		System.out.println(collection);
		System.out.println(collection.contains("AAA")); // true
		System.out.println(collection.contains("XXX")); // false

	}

}
