package com.asmin.PriorityQueue;

import java.util.PriorityQueue;

public class A {
	public static void main(String[] args) {
		PriorityQueue priorityQueue = new PriorityQueue();
		priorityQueue.add("AAA");
		priorityQueue.add("DDD");
		priorityQueue.add("CCC");
		priorityQueue.add("EEE");
		priorityQueue.add("BBB");
		System.out.println(priorityQueue);
		priorityQueue.add("BBB");
		priorityQueue.add("CCC");
		System.out.println(priorityQueue); // allows Duplicate Elements
		
//		priorityQueue.add(null);
//		System.out.println(priorityQueue); == NullpointerException(does not allow null Element)
		
//		priorityQueue.add(10);
//		System.out.println(priorityQueue); == classCastException(allow only Homogeneous element)
		
		
	}

}
