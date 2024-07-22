package com.asmin.ArrayList;
import java.util.*;

public class app03 {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		List list2 = new ArrayList(list1);// List to List
		
		Set set = new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println(set);
		List list3 = new ArrayList(set);// Set to List
		
		Queue queue = new PriorityQueue();
		queue.add(100);
		queue.add(200);
		queue.add(300);
		System.out.println(queue);
		List list4 = new ArrayList();
		

	}

}
