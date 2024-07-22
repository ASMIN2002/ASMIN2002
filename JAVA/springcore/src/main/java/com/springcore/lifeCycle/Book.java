package com.springcore.lifeCycle;

public class Book {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting Property");
		this.price = price;
	}

	public Book() {
		super();
		
	}

	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
}
