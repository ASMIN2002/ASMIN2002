package com.durgasoft.MainException;

class A{
	
}
class B extends A{
	
}

public class ClassCastException {
	public static void main(String[] args) {
	A a = new B();
	
	B b = (B) new A();

	}

}
