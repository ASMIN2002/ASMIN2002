package com.asmin.opps;

// this keyword with constructor for methods

class AB18{
	AB18(){
		System.out.println("A=con");
	}
	AB18(int i){
		System.out.println("A-int-param-con");
	}
	void m1() {
		// this(10);          == we can not access this(constructor) inside a method
		System.out.println("m1-A");
	}
		
}
public class A18 {
	public static void main(String[] args) {
		AB18 ab = new AB18();
		ab.m1();
	}

}
