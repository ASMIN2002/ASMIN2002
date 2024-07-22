package com.asmin.Gc;

// synchronized method()

class EE{
	EE(){
		System.out.println("Object creating ...");
	}
	public void finalize()throws Throwable{
		System.out.println("Object destroying ...");
	}
}
public class E{
	public static void main(String[] args) {
		EE e = new EE();
		e = null;
		Runtime rt = Runtime.getRuntime();
		rt.gc();
				
	}
}
