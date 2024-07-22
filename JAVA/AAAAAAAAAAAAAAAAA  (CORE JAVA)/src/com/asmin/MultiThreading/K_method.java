package com.asmin.MultiThreading;

// public void setPriority();
// public int getPriority();

public class K_method {
	public static void main(String[] args) {
		Thread thread = new Thread();
		System.out.println(thread.getPriority());
		thread.setPriority(7);
		System.out.println(thread.getPriority());
		//  thread.setPriority(15);					== > illegalArgumentException
		

	}

}
