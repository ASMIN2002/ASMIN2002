package com.asmin.Set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class H {
	public static void main(String[] args) {
		NavigableSet navigableSet = new TreeSet();
		navigableSet.add("BBB");
		navigableSet.add("AAA");
		navigableSet.add("CCC");
		navigableSet.add("DDD");
		navigableSet.add("FFF");
		navigableSet.add("EEE");
		System.out.println(navigableSet);
		System.out.println(navigableSet.descendingSet());    // descendingSet();
		System.out.println(navigableSet.ceiling("DDD"));	 // ceiling();
		System.out.println(navigableSet.higher("DDD"));		 // higher();
		System.out.println(navigableSet.floor("DDD"));		 // floor();
		System.out.println(navigableSet.lower("DDD"));		 // lower();
		System.out.println(navigableSet.pollFirst());		 // pollFirst();
		System.out.println(navigableSet.pollLast());		 // pollLast();
		System.out.println(navigableSet);
	}

}
