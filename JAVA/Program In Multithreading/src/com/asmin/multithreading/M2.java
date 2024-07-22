package com.asmin.multithreading;
class MyThread8 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread - "+i);
		}
	}
}
public class M2 {

	public static void main(String[] args) {
		MyThread8 myThread = new MyThread8();
		Thread thread = new Thread(myThread);
		thread.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread - "+i);
		}

	}

}
