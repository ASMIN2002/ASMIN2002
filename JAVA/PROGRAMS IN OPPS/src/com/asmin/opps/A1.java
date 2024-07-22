package com.asmin.opps;

class Test{
	static int i = 10;
	static void m1() {
		System.out.println("WELCOME TO OPPS");
	}
	static {
		System.out.println("STatic block");
	}
	Test(){
		System.out.println("CONSTRUCTOR ");
	}
}
public class A1 {

	public static void main(String[] args) {
		Test t = new Test();
		//System.out.println(t.i);
		//t.m1();

	}

}
