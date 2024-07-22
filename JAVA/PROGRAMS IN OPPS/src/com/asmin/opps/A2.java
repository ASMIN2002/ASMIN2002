package com.asmin.opps;
class A{
	void m1() {
		System.out.println("Instance method");
	}
	static void m2() {
		System.out.println("Static method");
	}
	static{
		System.out.println("Static block");
	}
}
public class A2 {
	public static void main(String[] args) {
		//A.m2();
		A a = new A();
	}

}
