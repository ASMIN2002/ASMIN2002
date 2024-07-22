package com.asmin.JavaFeatures;

@FunctionalInterface
interface I10{
	void m1();
	static void m2() {
		System.out.println("M2-I10");
	}
	default void m3() {
		System.out.println("M3-I10");
	}
}

class Class10 implements I10{
	public void m1() {
		System.out.println("M1-Class10");
	}
}

public class Functional_Interface {
	public static void main(String[] args) {
		I10 i = new Class10();
		i.m1();
		I10.m2();
		i.m3();
	}
}