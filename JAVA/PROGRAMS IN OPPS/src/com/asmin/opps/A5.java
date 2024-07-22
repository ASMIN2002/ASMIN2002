package com.asmin.opps;

class AA5{
	int eno = 111;
	String ename = "ASMIN";
	float esal = 50000.0f;
	String eaddr = "Hyd";	
	void display() {	
		System.out.println("Employee Details ");
		System.out.println("===================");
		System.out.println("Employee Number     : "+eno);
		System.out.println("Employee Name       : "+ename);
		System.out.println("Employee Salary     : "+esal);
		System.out.println("Employee Address    : "+eaddr);
	}
}

public class A5 {	
	public static void main(String[] args) {
		AA5 a = new AA5();
		a.display();
	}
}
	