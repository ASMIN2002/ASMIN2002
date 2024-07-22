package com.durgasoft;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

public class I {

	public static void main(String[] args) {
		Collection collection = new ArrayList();
		collection.add("AAA");
		collection.add("BBB");
		collection.add("CCC");
		collection.add("DDD");
		collection.add("EEE");
		collection.add("FFF");
		
		Object[] objects = collection.toArray();
		for(Object object: objects) {
			System.out.println(object);
		}
	}

}
