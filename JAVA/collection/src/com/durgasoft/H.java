 package com.durgasoft;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

public class H {

	public static void main(String[] args) {
		 Collection collection = new ArrayList();
		 collection.add("AAA");
		 collection.add("BBB");
		 collection.add("CCC");
		 collection.add("DDD");
		 collection.add("EEE");
		 System.out.println(collection);
		 System.out.println(collection.size());     // 5
		 System.out.println(collection.isEmpty());  // false
		 collection.clear();
		 System.out.println(collection);            //  [] 
		 System.out.println(collection.size());     //  0
		 System.out.println(collection.isEmpty());  // true

	}

}
