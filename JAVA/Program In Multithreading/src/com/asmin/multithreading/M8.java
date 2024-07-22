package com.asmin.multithreading;
class MyThread6 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("CHILD THREAD  = "+i);
		}
	}
}
public class M8 {
	public static void main(String[] args)throws Exception{
	MyThread6 myThread = new MyThread6();
	myThread.start();
	myThread.join();
	for(int i=0;i<10;i++){
		System.out.println("Main THREAD  = "+i);
	}
	
}
}
