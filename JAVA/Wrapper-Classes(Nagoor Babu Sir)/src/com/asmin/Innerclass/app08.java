package com.asmin.Innerclass;
abstract class A8{
	abstract class B8{
		void m1() {
			System.out.println("M1-B");
		}
		abstract void m2();
		abstract void m3();
	}
	class C8 extends B8{
		void m2() {
			System.out.println("M2-C");
		}
		void m3() {
			System.out.println("M3-C");
		}
	}
}
class D extends A8{
	// now every elements in class A8 are available in class D 
}



//Another approach of this

abstract class A82{
	abstract class B82{
		void m1() {
			System.out.println("M1-B");
		}
		abstract void m2();
		abstract void m3();
	}
	
}
class E extends A82{
	class C82 extends B82{
		void m2() {
			System.out.println("M2-C");
		}
		void m3() {
			System.out.println("M3-C");
		}
	}	 
}
public class app08 {
	public static void main(String[] args) {
		A8.B8 ab = new D().new C8();
		ab.m1();
		ab.m2();
		ab.m3();
		System.out.println();
		A82.B82 abc = new E().new C82();
		ab.m1();
		ab.m2();
		ab.m3();

	}

}





