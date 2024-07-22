package com.asmin.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class E {

	public static void main(String[] args) {
		Deque deque = new ArrayDeque();
		deque.add("AAA");
		deque.add("BBB");
		deque.add("CCC");
		deque.add("BBB");
		deque.add("DDD");
		deque.add("EEE");
		deque.add("BBB");
		deque.add("FFF");
		System.out.println(deque);
		System.out.println(deque.removeFirstOccurrence("BBB"));
		System.out.println(deque);
		System.out.println(deque.removeLastOccurrence("BBB"));
		System.out.println(deque);
		System.out.println(deque.removeFirstOccurrence("ZZZ"));
		System.out.println(deque.removeFirstOccurrence("ZZZ"));
	}

}
