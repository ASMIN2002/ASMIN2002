package com.asmin.Practice_with_Chinu;
class A{
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("COOL");
	}
	public String toString() {
		return "RAJ";
	}
}
class Test{
	public static void main(String[] args) {
	A a= new A();
	a = null;
	System.out.println(a);
	System.gc();
	}
}