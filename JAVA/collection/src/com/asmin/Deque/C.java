package com.asmin.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class C {

	public static void main(String[] args) {
		Deque deque = new ArrayDeque();
		deque.add("AAA");
		deque.add("BBB");
		deque.add("CCC");
		deque.add("DDD");
		deque.add("EEE");
		deque.add("FFF");
		System.out.println(deque);
		System.out.println();
		System.out.println(deque.removeLast());
		System.out.println(deque.removeLast());
		System.out.println(deque);
		System.out.println();
		System.out.println(deque.pollLast());
		System.out.println(deque.pollLast());
		System.out.println(deque);
		

	}

}
