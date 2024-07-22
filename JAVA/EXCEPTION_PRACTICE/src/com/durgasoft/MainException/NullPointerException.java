package com.durgasoft.MainException;

class A{

	void M1() {
		System.out.println("M1-A");
	}
}
public class NullPointerException {
	public static void main(String[] args) {
		A a = null;
		a.M1();
	}
}
