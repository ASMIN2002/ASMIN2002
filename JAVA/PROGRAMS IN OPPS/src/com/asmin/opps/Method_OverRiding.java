package com.asmin.opps;


class Super{
	void m1() {
		System.out.println("Super class");
	}
}
class Sub extends Super{
	void m1() {
		System.out.println("Sub class");
	}
}
public class Method_OverRiding {
	public static void main(String[] args) {
		Super super1 = new Sub();
		super1.m1();
	}

}
