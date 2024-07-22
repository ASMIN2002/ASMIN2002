package com.asmin.MultiThreading;

//synchronized method()

class EE{
	synchronized void m1() {
		for(int i =0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}class Thread1 extends Thread{
	  EE e;
	  Thread1(EE e){
		  this.e=e;
	  }
	  public void run() {
		  e.m1();
	  }
}
class Thread2 extends Thread{
	  EE e;
	  Thread2(EE e){
		  this.e=e;
	  }
	  public void run() {
		  e.m1();
	  }
}
class Thread3 extends Thread{
	  EE e;
	  Thread3(EE e){
		  this.e=e;
	  }
	  public void run() {
		  e.m1();
	  }
}
public class Q_Synchronized_Method{
	public static void main(String[] args) {
		EE e = new EE();
		
		Thread1 thread1 = new Thread1(e);
		Thread2 thread2 = new Thread2(e);
		Thread3 thread3 = new Thread3(e);
		
		thread1.setName("Thread-1");
		thread2.setName("Thread-2");
		thread3.setName("Thread-3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
			

	}

}

