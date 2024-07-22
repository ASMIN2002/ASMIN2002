package com.asmin.Innerclass;

class A3{
	void m1() {
		System.out.println("M1-A3");
	}
}
class B3{
	class C3 extends A{
		void m2() {
			System.out.println("M2-C3");
		}
	}
}
public class app03 {

	public static void main(String[] args){
		A3 a = new A3();
		a.m1();
		
		B3.C3 bc = new B3().new C3();
		bc.m1();
		bc.m2();
		

	}

}
