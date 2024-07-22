package com.asmin.Anonymous_Inner_class;
abstract class B{
	void m1() {
		System.out.println("M1-B");
	}
	abstract void m2();
	abstract void m3();
}
public class app02 {
	public static void main(String[] args) {
		B b = new B() {
			void m2() {
				System.out.println("M2-B");
			}
			void m3() {
				System.out.println("M3-B");
			}
		};
		b.m1();
		b.m2();
		b.m3();
		

	}

}
