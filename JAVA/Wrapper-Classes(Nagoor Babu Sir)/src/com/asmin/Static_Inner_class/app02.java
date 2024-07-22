package com.asmin.Static_Inner_class;
class A{
	int j = 20;
	static int k = 30;
	static class A1{
		int i = 10;
		void m1() {
			System.out.println("M1-A1");
			// System.out.println(j); === error
			System.out.println(k);
		}
	}
}
public class app02{
	public static void main(String[] args) {
		A.A1 a = new A.A1();
		System.out.println(a.i);
		a.m1();
	}

}
