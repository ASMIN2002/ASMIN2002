package com.asmin.beans;

public class Employee {
	private int eid;
	private String ename;
	private Address address;
	
	
	public Employee(int eid, String ename, Address address) {
		
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}


	public void display() {
		System.out.println("Id       : "+eid);
		System.out.println("Name     : "+ename);
		System.out.println("Address  : "+address);
	}

}
