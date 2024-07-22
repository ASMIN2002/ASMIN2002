package com.asmin.beans;

public class Student
{
	private int sid;
	private String name;
	private Address address;
	
	
	
	
	public Student(int sid, String name, Address address) {
		
		this.sid = sid;
		this.name = name;
		this.address = address;
	}




	public void display() {
		System.out.println("Id    : "+sid);
		System.out.println("Name  : "+name);
		System.out.println("Address  : "+address);
	}

}
