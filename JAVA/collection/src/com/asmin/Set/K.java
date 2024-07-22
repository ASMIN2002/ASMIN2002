package com.asmin.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class K {
	public static void main(String[] args) {
	List list = new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	System.out.println(list);
	TreeSet treeSet1 = new TreeSet(list);
	System.out.println(treeSet1);
	System.out.println();
	
	Set set = new HashSet();
	set.add(10);
	set.add(20);
	set.add(30);
	System.out.println(set);
	TreeSet treeSet2 = new TreeSet(set);
	System.out.println(treeSet2);
	System.out.println();
	
	Queue queue = new PriorityQueue();
	queue.add(100);
	queue.add(200);
	queue.add(300);
	System.out.println(queue);
	TreeSet treeSet3 = new TreeSet(queue);
	System.out.println(treeSet3);
	}

}
