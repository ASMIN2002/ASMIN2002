package com.asmin.ONE_TO_ONE_SETTER_METHOD_DEPENDENCY;

public class Employee {
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	
	private Account account;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}

	public String getEaddr() {
		return eaddr;
	}

	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void getEmployeeDetails(){
		System.out.println("Employee details");
		System.out.println("-------------------");
		System.out.println("Employee Number  : "+eno);
		System.out.println("Employee Name    : "+ename);
		System.out.println("Employee salary  : "+esal);
		System.out.println("Employee address : "+eaddr);
		System.out.println();
		
		System.out.println("Account details");
		System.out.println("------------------");
		System.out.println("Account Name   : "+account.getAccno());
		System.out.println("Account Holder name  : "+account.getAccHolderName());
		System.out.println("Account Type  : "+account.getAccType());
		System.out.println("Account Balance   : "+account.getBalance());
		
	}
}
