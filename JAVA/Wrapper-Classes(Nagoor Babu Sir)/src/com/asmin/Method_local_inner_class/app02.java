package com.asmin.Method_local_inner_class;
class A2{
	void m1() {
		abstract class B2{
			void m2() {
				System.out.println("M2-A");
			}
			abstract void m3();
			abstract void m4();	
		}
		class C2 extends B2{
			void m3() {
				System.out.println("M3-C");
			}
			void m4() {
				System.out.println("M4-C");
			}
		}
		B2 b = new C2();
		b.m2();
		b.m3();
		b.m4();
	}
}
public class app02 {

	public static void main(String[] args) {
		A2 a = new A2();
		a.m1();

	}

}
