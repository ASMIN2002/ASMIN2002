package com.asmin.PriorityQueue;

import java.util.PriorityQueue;

public class D {
	public static void main(String[] args) {
		PriorityQueue priorityQueue1 = new PriorityQueue();
		priorityQueue1.add("AAA");
		priorityQueue1.add("BBB");	
		priorityQueue1.add("EEE");
		priorityQueue1.add("CCC");
		priorityQueue1.add("DDD");
		System.out.println(priorityQueue1);
		System.out.println();
		
		PriorityQueue priorityQueue = new PriorityQueue(priorityQueue1);
		System.out.println(priorityQueue);
	}
}
