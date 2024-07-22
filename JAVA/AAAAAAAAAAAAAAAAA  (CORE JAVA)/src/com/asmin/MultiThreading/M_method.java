package com.asmin.MultiThreading;

// public boolean isAlive();

public class M_method {
	public static void main(String[] args) {
		Thread thread = new Thread();
		System.out.println(thread.isAlive());   // false
		thread.start();
		System.out.println(thread.isAlive());   // true

	}

}
