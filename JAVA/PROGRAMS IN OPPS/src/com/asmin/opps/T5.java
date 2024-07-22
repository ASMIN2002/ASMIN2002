package com.asmin.opps;

class TT5{
	static {
		System.out.println("Static block");
	}
	{
		System.out.println("Instance Block");
	}
	static int i = m1();
	int j = m2();
	
	static int m1() {
		System.out.println("M1=static");
		return 10;
	}
	int m2() {
		System.out.println("M2=non Static");
		return 20;
	}
	TT5(){
		System.out.println("A=con");
	}
}
public class T5 {
	public static void main(String[] args) {
		TT5 t = new TT5();
		System.out.println();
		TT5 t2 = new TT5();

	}

}
