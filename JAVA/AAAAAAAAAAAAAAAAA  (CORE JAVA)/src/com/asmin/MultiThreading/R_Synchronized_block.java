package com.asmin.MultiThreading;

//synchronized method()

class EE1{
	void m1() {
		System.out.println("Before Synchronized Block : "+Thread.currentThread().getName());
		synchronized(this) {
		for(int i =0;i<10;i++) {
			System.out.println("Inside Synchronized Block : "+Thread.currentThread().getName());
		}
		}
	}
}class Thread4 extends Thread{
	  EE1 e;
	  Thread4(EE1 e){
		  this.e=e;
	  }
	  public void run() {
		  e.m1();
	  }
}
class Thread5 extends Thread{
	  EE1 e;
	  Thread5(EE1 e){
		  this.e=e;
	  }
	  public void run() {
		  e.m1();
	  }
}
class Thread6 extends Thread{
	  EE1 e;
	  Thread6(EE1 e){
		  this.e=e;
	  }
	  public void run() {
		  e.m1();
	  }
}  
public class R_Synchronized_block{
	public static void main(String[] args) {
		EE1 e = new EE1();
		
		Thread4 thread4 = new Thread4(e);
		Thread5 thread5 = new Thread5(e);
		Thread6 thread6 = new Thread6(e);
		
		thread4.setName("Thread-1");
		thread5.setName("Thread-2");
		thread6.setName("Thread-3");
		
		thread4.start();
		thread5.start();
		thread6.start();
		
			

	}

}

