package com.asmin.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class E {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		ArrayDeque arrayDeque1 = new ArrayDeque(list);
		System.out.println(arrayDeque1);
		System.out.println();
		
		Set set = new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println(set);
		ArrayDeque arrayDeque2 = new ArrayDeque(set);
		System.out.println(arrayDeque2);
		System.out.println();
		
		Queue queue = new PriorityQueue();
		queue.add(100);
		queue.add(200);
		queue.add(300);
		System.out.println(queue);
		ArrayDeque arrayDeque3 = new ArrayDeque(queue);
		System.out.println(arrayDeque3);

	}

}
