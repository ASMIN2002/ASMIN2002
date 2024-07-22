package com.asmin.practice_multi_threading;

public class G {

	public static void main(String[] args) {
		Thread thread = new Thread();
		System.out.println(thread.isAlive());
		thread.start();
		System.out.println(thread.isAlive());

	}

}
