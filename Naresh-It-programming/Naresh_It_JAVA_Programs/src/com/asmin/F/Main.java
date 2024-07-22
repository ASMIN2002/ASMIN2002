package com.asmin.F;

class Test{
	int i = 10;
	static int j = 20;
	void m1() {
		System.out.println("*******Normal method********");
		System.out.println("I  = "+i);
		System.out.println("J  = "+j);
		System.out.println();
	}
	static void m2() {
		System.out.println("******Static Method**********");
		// System.out.println("I  = "+i); we can not assign normal variable in static method
		System.out.println("J  = "+j);
		
	}
}
public class Main {
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("**********Main Method**********");
		System.out.println("I  = "+test.i);
		System.out.println("J  = "+Test.j);
		System.out.println();
		
		test.m1();
		Test.m2();
	}

}
