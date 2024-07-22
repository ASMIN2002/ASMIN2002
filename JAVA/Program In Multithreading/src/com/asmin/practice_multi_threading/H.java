package com.asmin.practice_multi_threading;


class A7{
	void m1() {
		for(int i = 0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class Thread1 extends Thread{
	public void run() {
		A7 a = new A7();
		a.m1();
	}
}
class Thread2 extends Thread{
	public void run() {
		A7 a = new A7();
		a.m1();
		
	}
}
class Thread3 extends Thread{
	public void run() {
		A7 a = new A7();
		a.m1();
		
	}
}
public class H {
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		Thread3 thread3 = new Thread3();
		
		
		thread1.setName("Thread-1");
		thread2.setName("Thread-2");
		thread3.setName("Thread-3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
