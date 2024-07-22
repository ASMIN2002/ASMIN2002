package com.asmin.practice_multi_threading;

class B1 implements Runnable{
	public void run() {
		for(int i = 0;i <= 10;i++) {
			System.out.println("Child Thread : "+i);
		}
	}
}
public class B{
	public static void main(String[] args) {
		B1 b = new B1();
		Thread t = new Thread(b);
		t.start();
		for(int i = 0;i <= 10;i++) {
			System.out.println("Main Thread : "+i); 
		}

	}

}
