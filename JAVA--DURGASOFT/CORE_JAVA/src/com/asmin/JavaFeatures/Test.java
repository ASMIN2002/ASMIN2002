package com.asmin.JavaFeatures;

interface I4{
	void m1();
	default void m2() {
		System.out.println("m2-I4");
	}
}


class ClassA implements I4{
	public void m1() {
		System.out.println("M1-ClassA");
	}
}

class ClassB implements I4{
	public void m1() {
		System.out.println("M1-ClassB");
	}
}


public class Test {
	public static void main(String[] args) {
		I4 i = new ClassA();
		
		i.m1();
		i.m2();
		
		I4 i2 = new ClassB();
		i2.m1();
		i2.m2();	
		
	}
}
