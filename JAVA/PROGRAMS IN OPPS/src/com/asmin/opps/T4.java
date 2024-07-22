package com.asmin.opps;

class TTT{
	static {
		System.out.println("STATIC BLOCK");
	}
	static int m1() {
		System.out.println("M1=A");
		return 10;
	}
	static int i = m1();
}
public class T4 {
	public static void main(String[] args) {
		TTT t1 = new TTT();
		TTT t2 =  new TTT();
	}

}
