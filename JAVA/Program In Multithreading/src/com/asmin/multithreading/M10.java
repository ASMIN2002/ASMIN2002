package com.asmin.multithreading;
class A{
	synchronized void m1() {
		for(int i =0;i<10;i++) {
		System.out.println(Thread.currentThread().getName());
		}
	}
}
class Thread1 extends Thread{
	A a;
	Thread1(A a){
		this.a = a;
	}
	@Override
	public void run() {
		a.m1();
	}
}
class Thread2 extends Thread{
	A a;
	Thread2(A a){
		this.a = a;
	}
	@Override
	public void run() {
		a.m1();
	}
}
class Thread3 extends Thread{
	A a;
	Thread3(A a){
		this.a = a;
	}
	@Override
	public void run() {
		a.m1();
	}
}
public class M10 {

	public static void main(String[] args) {
		A a = new A();
		Thread1 thread1= new Thread1(a);
		Thread2 thread2= new Thread2(a);
		Thread3 thread3= new Thread3(a);
		
		thread1.setName("Thread=1");
		thread2.setName("Thread=2");
		thread3.setName("Thread=3");
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
