package com.asmin.Student;

public class Student 
{
	private String name;
	private int id;
	private int age;
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name  : "+name);
		System.out.println("Id    : "+id);
		System.out.println("Age   : "+age);
	}
}
