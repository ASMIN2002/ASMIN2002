package com.asmin.linkedlist;

import java.util.LinkedList;

// Methods in Linkedlist 
public class C {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("AAA");
		linkedList.add("BBB");						// add();
		linkedList.add("CCC");
		linkedList.add("DDD");
		linkedList.add("EEE");
		System.out.println(linkedList);
		linkedList.addFirst("XXX");					// addFirst();
		linkedList.addLast("ZZZ");					// addlast();
		System.out.println(linkedList);
		System.out.println();
		System.out.println(linkedList.getFirst());	// getFirst();
		System.out.println(linkedList.getLast()); 	// getLast();
		System.out.println();
		linkedList.removeFirst();					// removeFirst();
		linkedList.removeLast();					// removeLast()
		System.out.println(linkedList);
	}

}
