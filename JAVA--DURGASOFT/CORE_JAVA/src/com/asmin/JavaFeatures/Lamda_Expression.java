package com.asmin.JavaFeatures;

interface I11{
	void m1();
}
//class Class11 implements I11{
//	public void m1() {
//		System.out.println("M1-Class11");
//	}
//}
public class Lamda_Expression {
	public static void main(String[] args) {
		I11 i = ()->{
			System.out.println("ASMIN");
		};
		i.m1();
	} 
}