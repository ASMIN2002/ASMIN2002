package com.asmin.Innerclass;
abstract class A9{
	interface B9{
		
		void m1();
		void m2();
		void m3();
	}
	class C9 implements B9{
		public void m1() {
			System.out.println("M1-C");
		}
		public void m2() {
			System.out.println("M2-C");
		}
		public void m3() {
			System.out.println("M3-C");
		}
	}
}
class D9 extends A9{
}

// Another approach of this
abstract class A91{
	interface B91{
		
		void m1();
		void m2();
		void m3();
	}
	
}
class D91 extends A91{
	class C91 implements B91{
		public void m1() {
			System.out.println("M1-C");
		}
		public void m2() {
			System.out.println("M2-C");
		}
		public void m3() {
			System.out.println("M3-C");
		}
	}
}

public class app09 {
	public static void main(String[] args) {
	A9.B9 ab = new D9().new C9();
	ab.m1();
	ab.m2();
	ab.m3();
	System.out.println();
	A91.B91 abc = new D91().new C91();
	ab.m1();
	ab.m2();
	ab.m3();
	}

}
