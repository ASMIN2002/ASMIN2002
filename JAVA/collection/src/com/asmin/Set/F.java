package com.asmin.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class F {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();    // does not following Insertion Order
		hashSet.add("AAA");
		hashSet.add("BBB");
		hashSet.add("CCC");
		hashSet.add("DDD");
		hashSet.add("EEE");
		hashSet.add("FFF");
		System.out.println(hashSet);   // does not follow insertion Order
		System.out.println();
		
		LinkedHashSet linkedHashSet = new LinkedHashSet();  // is following insertion Order
		linkedHashSet.add("AAA");
		linkedHashSet.add("BBB");
		linkedHashSet.add("CCC");
		linkedHashSet.add("DDD");
		linkedHashSet.add("EEE");
		linkedHashSet.add("FFF");
		System.out.println(linkedHashSet);   // is following Insertion Order
	}

}
