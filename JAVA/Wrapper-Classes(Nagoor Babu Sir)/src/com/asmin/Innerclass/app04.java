package com.asmin.Innerclass;
class A4{
	void m1() {
		System.out.println("M1-A");
	}
	class B4 extends A4{
		void m2() {
			System.out.println("M2-B");
		}
	}
}
public class app04 {
	public static void main(String[] args) {
		A4 a = new A4();
		a.m1();
		
		A4.B4 ab = a.new B4();
		ab.m2();
		ab.m1();

	}

}
