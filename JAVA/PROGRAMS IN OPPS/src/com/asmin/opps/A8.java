package com.asmin.opps;

class AAA{
	int m1() {
		System.out.println("M1 = A");
		int v = 10;
		return v;
	}
}
public class A8 {
	public static void main(String[] args) {
		AAA aa = new AAA();
		aa.m1();
		System.out.println(aa.m1());

	}

}
