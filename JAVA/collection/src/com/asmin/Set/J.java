package com.asmin.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class J {
	public static void main(String[] args) {
	SortedSet sortedSet = new TreeSet();
	sortedSet.add("DDD");
	sortedSet.add("CCC");
	sortedSet.add("BBB");
	sortedSet.add("AAA");
	System.out.println(sortedSet);
	
	TreeSet treeSet = new TreeSet(sortedSet);
	System.out.println(treeSet);
	}
}
