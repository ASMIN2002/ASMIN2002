package com.asmin.MultiThreading;

public class Main extends Thread{
	
	@Override
	public void run() {
		System.out.println("I am Ready For Interview");
		for(int i = 1;i<=5;i++) {
			System.out.println("This is My "+i+" interview");
		}
		System.out.println("I got placed");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println("My Sleep Is got distrubing");
		}
		System.out.println("Time to Go to Office");
	}
	public static void main(String[] args) {
		Main main = new Main();
		Thread t = new Thread(main);
		t.start();
		t.interrupt();
	}

}
