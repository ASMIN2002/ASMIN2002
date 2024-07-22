package com.asmin.PriorityQueue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class F {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		PriorityQueue priorityQueue1 = new PriorityQueue(list);
		System.out.println(priorityQueue1);
		System.out.println();
		
		Set set = new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println(set);
		PriorityQueue priorityQueue2 = new PriorityQueue(set);
		System.out.println(priorityQueue2);
		System.out.println();
		
		Queue queue = new PriorityQueue();
		queue.add(100);
		queue.add(200);
		queue.add(300);
		System.out.println(queue);
		PriorityQueue priorityQueue3 = new PriorityQueue(queue);
		System.out.println(priorityQueue3);
		
		
				

	}

}
