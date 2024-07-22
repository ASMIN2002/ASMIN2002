package com.asmin.Map;

class A1{
	A1(){
		System.out.println("Object Creating ......");
	}
	
	protected void finalize() throws Throwable {
		System.out.println("Object destroying.......");
	}
	void m1() {
		System.out.println("M1 ()");
	}

}
public class J {
	public static void main(String[] args) {
		A1 a = new A1();
		a.m1();
		a=null;
		System.gc();
	

		
	}

}
