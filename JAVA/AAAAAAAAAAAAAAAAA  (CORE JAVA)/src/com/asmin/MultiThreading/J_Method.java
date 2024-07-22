package com.asmin.MultiThreading;

// public void setName(String name);
// public String getName();

public class J_Method {
	public static void main(String[] args) {
		Thread thread = new Thread();
		System.out.println(thread.getName());
		thread.setName("ASMIN");
		System.out.println(thread.getName());

	}

}
