package com.asmin.MultiThreading;

// public Thread(Runnable r);

public class E {
	public static void main(String[] args) {
		Runnable runnable = new Thread();
		Thread t = new Thread(runnable);
		System.out.println(t);   					// Thread[Thread-1,5,main]

	}

}
