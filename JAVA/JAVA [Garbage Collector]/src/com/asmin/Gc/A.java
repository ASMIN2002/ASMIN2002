package com.asmin.Gc;

// Garbage collector 

class Test{
	Test(){
		System.out.println("Object Creating ....");
	}
	protected void finalize()throws Throwable{
		System.out.println("Object Destroying ....");
	}
}
public class A {
	public static void main(String[] args) {
		Test t = new Test();
		t=null;
		System.gc();
		

	}

}
