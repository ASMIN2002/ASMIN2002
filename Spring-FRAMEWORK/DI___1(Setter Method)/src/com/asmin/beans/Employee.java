package com.asmin.beans;

public class Employee {
	private int eid;
	private String ename;
	private Address address;
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Id       : "+eid);
		System.out.println("Name     : "+ename);
		System.out.println("Address  : "+address);
	}

}
