package com.asmin.practice_multi_threading;

public class D {
	public static void main(String[] args) {
		Thread thread = new Thread();
		System.out.println(thread.getName());
		thread.setName("ASMIN");
		System.out.println(thread.getName());

	}

}
