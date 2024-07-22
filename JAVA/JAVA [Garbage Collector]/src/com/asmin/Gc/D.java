package com.asmin.Gc;

class Employee{
	Employee(){
		System.out.println("Object Creating ...");
	}	
	protected void finalize() throws Throwable {
		System.out.println("Object Destroying ...");
	}
}
	class Dc{
		void m1() {
			Employee employee = new Employee();
		}
	}

public class D {
	public static void main(String[] args) {
		Dc d = new Dc();
		d.m1();
		System.gc();

	}

}
