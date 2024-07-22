package com.asmin.beans;

public class Student 
{
	private int roll;
	private String name;
	private Adddress address;
	
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public Adddress getAddress() {
		return address;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Adddress address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("ROLL    : "+roll);
		System.out.println("NAME    : "+name);
		System.out.println("Address : "+address);
	}
	
}
