package com.asmin.Innerclass;
class A{
	int i = 10;
	void m1() {
		System.out.println("M1-A");
		
	}
	class B{
		int j = 20;
		void m2() {
			System.out.println("M2-B");
			System.out.println(i);
			m1();
		}
	}
}
public class app01{
	public static void main(String[] args){	
		A a = new A();
		System.out.println(a.i);
		a.m1();
		System.out.println();
		
		A.B ab = new A().new B();
		System.out.println(ab.j);
		ab.m2();
	}
}
