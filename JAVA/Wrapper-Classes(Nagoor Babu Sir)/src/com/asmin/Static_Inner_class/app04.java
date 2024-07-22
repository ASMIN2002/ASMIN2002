package com.asmin.Static_Inner_class;
interface I1{
	abstract class A4{
		void m1() {
			System.out.println("M1-A");
		}
		abstract void m2(); 
	}
	class B4 extends A4{
		void m2() {			
			System.out.println("M2-A");
		}
	}
}
public class app04 {

	public static void main(String[] args) {		
		I1.A4 ia = new I1.B4();
		ia.m1();
		ia.m2();
		
	}

}
