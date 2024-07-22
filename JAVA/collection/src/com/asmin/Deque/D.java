package com.asmin.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class D {

	public static void main(String[] args) {
		Deque deque = new ArrayDeque();
		deque.add("AAA");
		deque.add("BBB");
		deque.add("CCC");
		deque.add("DDD");
		deque.add("EEE");
		deque.add("FFF");
		System.out.println(deque);
		System.out.println(deque.getFirst());
		System.out.println(deque.peekFirst());
		System.out.println(deque.getLast());
		System.out.println(deque.peekLast());

	}

}
