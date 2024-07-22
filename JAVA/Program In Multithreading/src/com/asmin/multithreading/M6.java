package com.asmin.multithreading;

public class M6 {

	public static void main(String[] args) {
		Thread thread = new Thread();
		System.out.println(thread.isAlive());
		thread.start();
		System.out.println(thread.isAlive());
	}

}
