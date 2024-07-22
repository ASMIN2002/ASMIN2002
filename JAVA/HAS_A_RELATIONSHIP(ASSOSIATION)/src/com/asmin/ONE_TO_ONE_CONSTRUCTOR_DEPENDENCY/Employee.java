package com.asmin.ONE_TO_ONE_CONSTRUCTOR_DEPENDENCY;

public class Employee {
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	
	private Account account;

	public Employee(int eno, String ename, float esal, String eaddr, Account account) {
		
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
		this.account = account;
	}
	public void getEmployeedetails() {
		System.out.println("Employee Details ");
		System.out.println("-------------------");
		System.out.println("Employee Number  : "+eno);
		System.out.println("Employee name    : "+ename);
		System.out.println("Employee Salary  : "+esal);
		System.out.println("Employee Address : "+eaddr);
		System.out.println();
		account.getAccountdetails();
	}
	
}
