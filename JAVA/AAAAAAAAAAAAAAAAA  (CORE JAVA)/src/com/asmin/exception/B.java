package com.asmin.exception;

// NullPointerException

class B1{
	int i = 10;
}

public class B {
	public static void main(String[] args) {
		B1 b = new B1();
		b = null;
		System.out.println(b.i);

	}

}
