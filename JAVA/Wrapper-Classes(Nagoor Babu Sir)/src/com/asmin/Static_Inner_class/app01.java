package com.asmin.Static_Inner_class;
class A{ 
	static class A1{
		int i = 10;
		void m1() {
			System.out.println("M1-A1");
		}
	}
}

public class app01 {
	public static void main(String[] args) {
		A.A1 a = new A.A1();
		System.out.println(a.i);
		a.m1();
	}

}
