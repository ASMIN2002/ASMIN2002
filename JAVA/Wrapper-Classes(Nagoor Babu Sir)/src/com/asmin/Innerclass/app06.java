package com.asmin.Innerclass;
class A6{
	interface I{
		void m1();
		void m2();
		void m3();
	}
	class B6 implements I{
		public void m1() {
			System.out.println("M1-B");
		}
		public void m2() {
			System.out.println("M2-B");
		}
		public void m3() {
			System.out.println("M3-B");
		}
	}
}
public class app06 {
	public static void main(String[] args) {
		A6.I ai = new A6().new B6();
		ai.m1();
		ai.m2();
		ai.m3();
		

	}

}
