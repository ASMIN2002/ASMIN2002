package com.asmin.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class A {
	public static void main(String[] args) {
		Deque deque = new ArrayDeque();
		deque.addFirst("AAA");				// addFirst();
		deque.addFirst("BBB");				
		deque.offerFirst("CCC");			// offerFirst();
		deque.offerFirst("DDD");
		System.out.println(deque);
		deque.addLast("EEE");				// addLast();
		deque.addLast("FFF");
		deque.offerLast("GGG");				// offerLast();
		deque.offerLast("HHH");
		System.out.println(deque);
		
	}
}
