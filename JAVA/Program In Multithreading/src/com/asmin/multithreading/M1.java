package com.asmin.multithreading;
class MyThread extends Thread{
	public void run() {
		for(int i = 0;i < 10;i++) {
			System.out.println("Child Thread- "+i);
		}
	}
}
public class M1 {
	public static void main(String[] args) {
	MyThread myThread = new MyThread();
	myThread.start();
		for(int i = 0;i<10;i++) {
			System.out.println("Main Thread- "+i);
		}
	}

}
