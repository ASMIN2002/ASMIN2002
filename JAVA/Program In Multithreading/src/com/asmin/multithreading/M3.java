package com.asmin.multithreading;

public class M3 {

	public static void main(String[] args) {
		Thread thread = new Thread();
		System.out.println(thread.getName());
		thread.setName("ASMIN");
		System.out.println(thread.getName());

	}

}
