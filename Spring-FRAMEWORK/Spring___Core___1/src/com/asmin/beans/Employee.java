package com.asmin.beans;

public class Employee {
	private String name;
	private int id;
	private String email;
	
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("Name  : "+name);
		System.out.println("Id    : "+id);
		System.out.println("Email : "+email);
	}
}
