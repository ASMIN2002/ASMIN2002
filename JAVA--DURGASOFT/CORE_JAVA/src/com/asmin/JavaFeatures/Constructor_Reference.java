package com.asmin.JavaFeatures;

interface I1{
	void m1();
}
class A1{
	A1(){
		System.out.println("A-Con");
	}
}

public class Constructor_Reference {
	public static void main(String[] args) {
		I1 i1 = A1::new;
		i1.m1();

	}

}