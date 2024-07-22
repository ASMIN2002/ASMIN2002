package com.asmin.practice_multi_threading;

public class E {

	public static void main(String[] args) {
		Thread thread = new Thread();
		System.out.println(thread.getPriority());
		thread.setPriority(8);
		System.out.println(thread.getPriority());

	}

}
