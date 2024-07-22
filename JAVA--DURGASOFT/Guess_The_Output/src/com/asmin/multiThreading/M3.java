package com.asmin.multiThreading;

class MyThread extends Thread{
	public void run() {
		System.out.println("Running Thread   : "+currentThread().getName());
		System.out.println("Running Thread Priority  : "+currentThread().getPriority());
	}
}

public class M3 {
	public static void main(String[] args) {
		MyThread m = new MyThread();
		MyThread m1 = new MyThread();
		
		m.start();
		m1.start();
	}

}
