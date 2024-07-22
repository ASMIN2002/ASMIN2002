package com.asmin.linkedlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class B {

	public static void main(String[] args) {
	List list = new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	System.out.println(list);
	LinkedList linkedList1 = new LinkedList(list); // List to Linkedlist
	System.out.println(linkedList1);
	System.out.println();
	
	Set set = new HashSet();
	set.add(10);
	set.add(20);
	set.add(30);
	System.out.println(set);
	LinkedList linkedList2 = new LinkedList(set);  // Set to Linkedlist
	System.out.println(linkedList2);
	System.out.println();
	
	Queue queue = new PriorityQueue();
	queue.add(100);
	queue.add(200);
	queue.add(300);
	System.out.println(queue);
	LinkedList linkedList3 = new LinkedList(queue);  // Queue to Linkedlist
	System.out.println(linkedList3);

	}

}
