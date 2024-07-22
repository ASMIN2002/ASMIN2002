package com.asmin.multithreading;

public class M4 {

	public static void main(String[] args) {
		Thread thread = new Thread();
		System.out.println(thread.getPriority());  // 5
		thread.setPriority(6);
		System.out.println(thread.getPriority()); 	// 6
		// thread.setPriority(11);
	    // System.out.println(thread.getPriority());   // Exception
	}
}
