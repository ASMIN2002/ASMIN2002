package com.asmin.MultiThreading;

// Daemon Thread      ex- (Garbage Collector)

class GarbageCollector extends Thread{
	public void run() {
		while(true) {
			System.out.println("garbage Collector");
		}
	}
}
public class P_DemonThread {
	public static void main(String[] args) {
		GarbageCollector collector = new GarbageCollector();
		collector.setDaemon(true);
		collector.start();
		//  collector.setDaemon(true);    		==> java.lang.IllegalThreadStateException(must declare before start())
		for(int i = 0;i<10;i++) {
			System.out.println("Main Thread  :  ");
		}
		System.out.println(collector.isDaemon());

	}

}
