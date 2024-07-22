package com.asmin.practice_multi_threading;

public class C {

	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("COOL");
		Thread thread = new Thread(group,"ASMIN");
		System.out.println(thread);

	}

}
