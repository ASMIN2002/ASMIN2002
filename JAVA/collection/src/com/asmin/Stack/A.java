package com.asmin.Stack;

import java.util.Stack;

public class A {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("AAA");
		stack.push("BBB");
		stack.push("CCC");
		stack.push("DDD");
		stack.push("EEE");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.search("BBB"));   // 3
		System.out.println(stack.search("ZZZ"));   // -1

	}

}
