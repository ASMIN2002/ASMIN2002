package com.asmin.multithreading;
class A0{
	 void m1() {
		System.out.println("Before synchronized block  : "+Thread.currentThread().getName());
		synchronized(this) {
		for(int i =0;i<10;i++) {
		System.out.println("After synchronized block  : "+Thread.currentThread().getName());
		}
	}
}
}

class Thread9 extends Thread{
	A0 a;
	Thread9(A0 a){
		this.a = a;
	}
	@Override
	public void run() {
		a.m1();
	}
}
class Thread90 extends Thread{
	A0 a;
	Thread90(A0 a){
		this.a = a;
	}
	@Override
	public void run() {
		a.m1();
	}
}
class Thread99 extends Thread{
	A0 a;
	Thread99(A0 a){
		this.a = a;
	}
	@Override
	public void run() {
		a.m1();
	}
}
public class M11 {

	public static void main(String[] args) {
		A0 a = new A0();
		Thread9 thread1= new Thread9(a);
		Thread90 thread2= new Thread90(a);
		Thread99 thread3= new Thread99(a);
		
		thread1.setName("Thread=1");
		thread2.setName("Thread=2");
		thread3.setName("Thread=3");
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}

