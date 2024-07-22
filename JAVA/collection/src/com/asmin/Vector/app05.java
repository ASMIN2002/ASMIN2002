package com.asmin.Vector;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;

public class app05 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		Vector vector1 = new Vector(list); // List to Vector
		System.out.println(vector1);
		System.out.println();
		
		Set set = new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println(set);
		Vector vector2 = new Vector(set); // Set to Vector
		System.out.println(vector2);
		System.out.println();
		
		Queue queue = new PriorityQueue();
		queue.add(100);
		queue.add(200);
		queue.add(300);
		System.out.println(queue);
		Vector vector3 = new Vector(queue); // Queue to Vector
		System.out.println(vector3);
	}
}
