package com.asmin.inheritance;
  
      // Hierarchical inheritance

class A{
	public void print_A() {
		System.out.println("Class A");
	}
}
class B extends A{
	public void print_B() {
		System.out.println("Class B");
	}
}
class C extends A{
	public void print_C() {
		System.out.println("Class C");
	}
}
class D extends A{
	public void print_D() {
		System.out.println("Class D");
	}
}
public class I5 {
	public static void main(String[] args) {
		B objb = new B();
		objb.print_A();
		objb.print_B();
		
		C objc = new C();
		objc.print_A();
		objc.print_C();
		
		D objd = new D();
		objd.print_A();
		objd.print_D();
	}

}
