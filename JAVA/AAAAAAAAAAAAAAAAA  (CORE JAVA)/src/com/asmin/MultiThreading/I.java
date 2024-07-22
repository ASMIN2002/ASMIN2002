package com.asmin.MultiThreading;

// public Thread(ThreadGroup tg,Runnable r,String Name);

public class I {
	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("JAVA");
		Runnable runnable = new Thread();
		Thread thread = new Thread(group,runnable,"ASMIN");
		System.out.println(thread);								// Thread[ASMIN,5,JAVA]

	}

}
