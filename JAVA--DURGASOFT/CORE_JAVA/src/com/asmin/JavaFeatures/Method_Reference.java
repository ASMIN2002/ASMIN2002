package com.asmin.JavaFeatures;

		// Instance Method

//
//interface I{
//	void m1();
//}
//class A{
//	void m2() {
//	  System.out.println("M2-A");
//	}
//}
//
//public class Method_Reference {
//	public static void main(String[] args) {
//		
//		I i = new A()::m2;
//		i.m1();
//		
//		}
//
//}


        // Static method


interface I{
	void m1();
}
class A{
	static void m2() {
	  System.out.println("M2-A");
	}
}

public class Method_Reference {
	public static void main(String[] args) {
		
		I i = A::m2;
		i.m1();
		
		}

}