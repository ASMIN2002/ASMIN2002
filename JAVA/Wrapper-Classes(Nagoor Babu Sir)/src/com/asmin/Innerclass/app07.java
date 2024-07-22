package com.asmin.Innerclass;
abstract class A7{
	class B7{
		void m1() {
			System.out.println("M1-B");
		}
		void m2() {
			System.out.println("M2-B");
		}
		void m3() {
			System.out.println("M3-B");
		}
	}
}
class C7 extends A7{
	// now class B7 is an inner class to C7
}
public class app07 {
	public static void main(String[] args){
		A7.B7 ab = new C7().new B7();
		ab.m1();
		ab.m2();
		ab.m3();
		
	}
}
