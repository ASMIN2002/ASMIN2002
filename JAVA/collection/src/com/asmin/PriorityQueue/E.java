package com.asmin.PriorityQueue;

import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class E {

	public static void main(String[] args) {
		SortedSet sortedSet = new TreeSet();
		sortedSet.add("AAA");
		sortedSet.add("BBB");
		sortedSet.add("DDD");
		sortedSet.add("EEE");
		sortedSet.add("CCC");
		System.out.println(sortedSet);
		System.out.println();
		PriorityQueue priorityQueue = new PriorityQueue(sortedSet);
		System.out.println(priorityQueue);
		

	}

}
