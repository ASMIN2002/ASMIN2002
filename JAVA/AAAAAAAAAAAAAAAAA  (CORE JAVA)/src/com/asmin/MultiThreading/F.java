package com.asmin.MultiThreading;

// public Thread(Runnable r,String Name)


public class F {
	public static void main(String[] args) {
		Runnable runnable = new Thread();
		Thread thread = new Thread(runnable,"ASMIN");
		System.out.println(thread);

	}

}
