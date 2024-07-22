package com.asmin.MultiThreading;

// public Thread(ThreadGroup tg,String Name)

public class G {
	public static void main(String[] args) {
	ThreadGroup group = new ThreadGroup("JAVA");
	Thread thread = new Thread(group,"ASMIN");
	System.out.println(thread); 					// Thread[ASMIN,5,JAVA]

	}

}
