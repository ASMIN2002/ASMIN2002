package com.asmin.multithreading;

class GrabageCollector extends Thread{
	public void run() {
		while(true) {
			System.out.println("DAEMON THREAD");
		}
	}
}
public class M9 {
	public static void main(String[] args) {
		GrabageCollector gc = new GrabageCollector();
		gc.setDaemon(true);  // == Must be represent before start method otherwise we will get java.lang.illigalthreadstate exception
		gc.start();
		
		for(int i = 0;i<10;i++) {
			System.out.println("MAIN THREAD");
		}
		System.out.println(gc.isDaemon());

	}

}
