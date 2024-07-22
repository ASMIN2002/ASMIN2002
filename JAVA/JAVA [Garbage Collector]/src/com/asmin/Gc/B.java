package com.asmin.Gc;

class Book{
	Book(){
		System.out.println("Object Creating ...");
	}
	protected void finalize()throws Throwable {
		System.out.println("Object destroying ....");
	}
}

public class B {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		b1 = null;
		System.gc();
		b2 = null;
		System.gc();

	}

}
