package com.asmin.practice_multi_threading;

class A1 extends Thread{
	public void run() {
		for(int i = 0;i <= 10;i++) {
			System.out.println("Child Thread : "+i);
		}
	}
}
public class A {
	public static void main(String[] args) {
		A1 a = new A1();
		a.start();
		for(int i = 0;i <= 10;i++) {
			System.out.println("Main Thread : "+i);
		}

	}

}