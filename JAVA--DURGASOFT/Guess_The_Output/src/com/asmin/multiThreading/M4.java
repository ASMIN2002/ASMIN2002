package com.asmin.multiThreading;

class CheckingMyDemonThread extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("I am daemon Thread and I am Working ");
		}else {
			System.out.println("I am user Thread and I am Working");
		}
	}
}
public class M4 {
	public static void main(String[] args) {
		CheckingMyDemonThread c1 = new CheckingMyDemonThread();
		CheckingMyDemonThread c2 = new CheckingMyDemonThread();
		CheckingMyDemonThread c3 = new CheckingMyDemonThread();
		
		c2.setDaemon(true);
		
		c1.start();
		c2.start();
		c3.start();
	}

}