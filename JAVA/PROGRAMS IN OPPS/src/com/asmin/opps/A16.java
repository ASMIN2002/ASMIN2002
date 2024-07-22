package com.asmin.opps;

class AB16{
	void m1() {
		this.m2(); // not needed
		m2();
		System.out.println("M1-A");
		
	}
	void m2() {
		System.out.println("M2-A");
	}
}
public class A16 {
	public static void main(String[] args) {
		AB16 ab = new AB16();
		ab.m1();

	}

}
