package com.asmin.opps;

// use this keyword in constructor

class AB17{
	AB17(){
		this(10);
		System.out.println("A=con");
	}
	AB17(int i){
		this(40.0f);
		System.out.println("A-Int-param-con");
	}
	AB17(float f){
		this(356.9000);
		System.out.println("A-float-param-con");
	}
	AB17(double d){
		System.out.println("A-Double-param-con");
	}
}
public class A17 {
	public static void main(String[] args) {
		AB17 ab = new AB17();
	}

}
