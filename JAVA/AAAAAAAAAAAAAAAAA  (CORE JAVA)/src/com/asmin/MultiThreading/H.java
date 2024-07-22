package com.asmin.MultiThreading;

// public Thread(ThreadGroup tg,Runnable r);

public class H {
	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("JAVA");
		Runnable runnable = new Thread();
		Thread thread = new Thread(group,runnable);
		System.out.println(thread);						// Thread[Thread-1,5,JAVA]

	}

}
