package com.asmin.inheritance;

class Employee{
	int salary = 60000;
}
class Engineer extends Employee{
	int benifits = 10000;
}
public class I2 {
	public static void main(String[] args) {
		Engineer ei = new Engineer();
		System.out.println("Salary  : "+ei.salary
				+"\nBenifits  : "+ei.benifits);
	}
}