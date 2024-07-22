package com.asmin.JavaFeatures;

interface I2{
	public static void m1(){
		System.out.println("STATIC-m1");
	}
	public static void m2(){
		System.out.println("STATIC-m2");
	}

	public static void m3(){
		System.out.println("STATIC-m3");
	}
}
class Cls implements I2{
	
}
public class Static_Method_Inside_an_Interface {
	public static void main(String[] args) {
		I2.m1();
		I2.m2();
		I2.m3();
		
		Cls cls = new Cls();
	//	cls.m1();  // error
	//	Cls.m1();  // error
		
	}
}