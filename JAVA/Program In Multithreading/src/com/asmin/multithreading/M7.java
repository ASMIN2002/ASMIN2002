package com.asmin.multithreading;
class WelcomeThread extends Thread{
	
	public void run() {
		for(int i = 0; i < 10; i ++) {
		try {
			Thread.sleep(500);
			System.out.println("Welcome Thread - "+i);
			}
		 catch (InterruptedException e) {	
			e.printStackTrace();
		}
}
		
}
}
public class M7 {
	public static void main(String[] args) {
		WelcomeThread thread = new WelcomeThread();
		thread.start();

	}

}
