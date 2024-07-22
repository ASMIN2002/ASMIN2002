package com.asmin.Set;

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
		HashSet hashSet1 = new HashSet(list);  // List to Hashset
		System.out.println(hashSet1);
		System.out.println();
		
		Set set = new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println(set);
		HashSet hashSet2 = new HashSet(set);	// Set to Hashset
		System.out.println(hashSet2);
		System.out.println();
		
		Queue queue= new PriorityQueue();
		queue.add(100);
		queue.add(200);
		queue.add(300);
		System.out.println(queue);
		HashSet hashSet3 = new HashSet(queue);	// Queue to Hashset
		System.out.println(hashSet3);
		

	}

}
