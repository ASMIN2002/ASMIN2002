package com.asmin.Method_local_inner_class;
class A{
	void m1() {
		class B{
			void m2() {
				System.out.println("M2-B");
			}
			void m3() {
				System.out.println("M3-B");
			}
			
		}
		B b = new B();
		b.m2();
		b.m3();
	}
}
public class app01 {

	public static void main(String[] args) {
		A a = new A();
		a.m1();
	

	}

}
