package com.asmin.multiThreading;

class MyThread1 extends Thread{
	public void run() {
		System.out.println("Thread1 is Running");
	}
}
class MyThread2 extends Thread{
	public void run() {
		System.out.println("Thread2 is Running");
	}
}
public class M1 {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2();
		
		myThread1.start();
		myThread2.start();

	}

}
