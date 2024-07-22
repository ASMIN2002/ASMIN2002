package com.asmin.practice_multi_threading;

class Sleep extends Thread{
	public void run() {
		for(int i = 0;i< 10;i++) {
			try {
			Thread.sleep(500);
			System.out.println("Child Thread  ");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class Sleep_method {
	public static void main(String[] args) {
		Sleep sleep = new Sleep();
		sleep.start();
	}
}
