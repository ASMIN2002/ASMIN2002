package com.asmin.MultiThreading;

public class A {
	public static void main(String[] args) throws Exception{
		System.out.println("J");
		Thread.sleep(5000);
		System.out.println("a");
		Thread.sleep(5000);
		System.out.println("V");
		Thread.sleep(5000,5000);
		System.out.println("a");
	}
}