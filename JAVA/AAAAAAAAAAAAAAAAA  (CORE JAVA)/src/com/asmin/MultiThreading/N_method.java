package com.asmin.MultiThreading;

// public static void sleep(long time)throws interruptedException

class N extends Thread {
	public void run() {
		for(int i = 0;i < 10;i++) {
			try {
			Thread.sleep(200);
			System.out.println("Child Thread  : "+i);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

public class N_method {
	public static void main(String[] args) {
		N n = new N();
		n.start();
		
	}
}
