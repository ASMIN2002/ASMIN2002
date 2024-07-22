package com.asmin.bean;

public class Student {
	private String name;
	private int id;
	private float sal;
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public float getSal() {
		return sal;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	
	public void display() {
		System.out.println("Name   : "+name);
		System.out.println("Id     : "+id);
		System.out.println("Sal    : "+sal);
	}
}
