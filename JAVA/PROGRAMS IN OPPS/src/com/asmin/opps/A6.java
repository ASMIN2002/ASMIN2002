package com.asmin.opps;

abstract class AA6{
	void m1() {
		System.out.println("M1=method");
	}
}
class Aa6 extends AA6{
	void m2() {
		System.out.println("M2 = A");
	}
}
public class A6 {
	public static void main(String[] args) {
		AA6 a = new Aa6();
		a.m1();
		
		Aa6 a2 = new Aa6();
		a2.m1();
		a2.m2();
		
	}

}
