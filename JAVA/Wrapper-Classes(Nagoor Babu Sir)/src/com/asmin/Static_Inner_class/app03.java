package com.asmin.Static_Inner_class;
interface I{
	class A3{
		void m1() {
			System.out.println("M1-A");
		}
		void m2() {
			System.out.println("M2-A");
		}
		void m3() {
			System.out.println("M3-A");
		}		
	}
}
public class app03 {
	public static void main(String[] args) {
		I.A3 ai = new I.A3();
		ai.m1();
		ai.m2();
		ai.m3();

	}

}
