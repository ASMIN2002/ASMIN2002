package com.asmin.Static_Inner_class;
interface I5{
	interface I6{
		void m1();
		void m2();
		void m3();
		}
	class A5 implements I6{
		public void m1() {
			System.out.println("M1-A");
		}
		public void m2() {
			System.out.println("M2-A");
		}
		public void m3() {
			System.out.println("M3-A");
		}
	}
}
public class app05 {
	public static void main(String[] args) {
		I5.A5 ia = new I5.A5();
		ia.m1();
		ia.m2();
		ia.m3();
	}
}
