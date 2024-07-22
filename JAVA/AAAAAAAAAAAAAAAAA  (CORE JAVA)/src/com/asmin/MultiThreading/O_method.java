package com.asmin.MultiThreading;

// public void join() throws interrupted
class O extends Thread{
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println("Child Thread  : "+i);
		}
	}
}
public class O_method {
	public static void main(String[] args)throws Exception {
		O o = new O();
		o.start();
		o.join();			                      // we can provide mills second also 
		for(int i =0;i<10;i++) {
			System.out.println("Main Thread  : "+i);
		}

	}

}
