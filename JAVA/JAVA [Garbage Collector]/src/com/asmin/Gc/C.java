package com.asmin.Gc;

class CC{
	CC(){
		System.out.println("Object Creating...");
	}
	
	protected void finalize() throws Throwable {
		System.out.println("Object Destroying ...");
	}
}
public class C {
	public static void main(String[] args) {
		CC c1 = new CC();
		c1 = new CC();
		System.gc();

	}

}
