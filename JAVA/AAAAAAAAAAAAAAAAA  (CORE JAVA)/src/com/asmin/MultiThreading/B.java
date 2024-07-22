package com.asmin.MultiThreading;

class B1 implements Runnable{
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println("Child Thread = "+i);
		}
	}
}
public class B {
	public static void main(String[] args) {
		B1 b = new B1();
		Thread thread = new Thread(b);
		thread.start();
		for(int i = 0; i<10;i++) {
			System.out.println("Main Thread = "+i);
		}

	}

}
