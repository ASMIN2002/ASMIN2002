package com.asmin.Innerclass;

class A1{
	class B{
		void m1() {
			System.out.println("M1-B");
		}
	}
	class C extends B{
		void m2() {
			System.out.println("M2-C");
		}
	}
}
public class app02{
	public static void main(String[] args) {
		A1.B ab = new A1().new B();
		ab.m1();
		System.out.println();
		
		A1.C ac = new A1().new C();
		ac.m1();
		ac.m2();

	}

}
