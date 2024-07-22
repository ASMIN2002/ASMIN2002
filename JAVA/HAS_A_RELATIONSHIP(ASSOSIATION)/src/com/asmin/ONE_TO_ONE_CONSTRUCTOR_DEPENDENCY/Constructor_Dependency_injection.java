package com.asmin.ONE_TO_ONE_CONSTRUCTOR_DEPENDENCY;

// constructor dependency Injection

public class Constructor_Dependency_injection {
	public static void main(String[] args) {
		Account account = new Account("A-111", "ASMIN", "Savings", 5000);
		Employee employee = new Employee(111, "CHINMAY", 6000.0f , "BNGL", account);
		employee.getEmployeedetails();
	}
}
