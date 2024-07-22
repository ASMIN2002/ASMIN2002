package com.asmin.opps;

class TT3{
	static int i = m1();
	static {
		System.out.println("STATIC BLOCK");
	}
	static int m1() {
		System.out.println("M1=A");
		return 10;
	}
}
public class T3 {
	public static void main(String[] args) {
		TT3 tt = new TT3();

	}

}
