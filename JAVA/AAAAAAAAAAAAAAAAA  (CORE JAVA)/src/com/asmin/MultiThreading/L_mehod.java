package com.asmin.MultiThreading;

// public static int activeCount();

public class L_mehod {
	public static void main(String[] args) {
		System.out.println(Thread.activeCount());   // 1
		Thread t = new Thread();
		System.out.println(Thread.activeCount());   // 1
		t.start();
		System.out.println(Thread.activeCount());   // 2  (for accessing start method)
		

	}

}
