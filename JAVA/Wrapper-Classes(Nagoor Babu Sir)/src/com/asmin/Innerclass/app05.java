package com.asmin.Innerclass;

import java.awt.desktop.AboutEvent;

import com.asmin.Innerclass.A5.C5;

class A5{
	void m() {
		System.out.println("M-A5");
	}
	abstract class B5{
		void m1() {
			System.out.println("M1-B5");
		}
		abstract void m2();
		abstract void m3();
		}
	class C5 extends B5{
		void m2() {
			System.out.println("M2-C5");
		}
		void m3() {
			System.out.println("M3-C5");
		}
	}
	
}
public class app05 {
	public static void main(String[] args) {
		A5 a = new A5();
		a.m();
		
		A5.C5 ac = new A5().new C5();
		ac.m1();
		ac.m2();
		ac.m3();
		
		A5.B5 ab = new A5().new C5();
		ab.m1();
		ab.m2();
		ab.m3();
		
		

	}

}
