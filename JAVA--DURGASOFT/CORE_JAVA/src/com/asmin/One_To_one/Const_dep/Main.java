package com.asmin.One_To_one.Const_dep;


public class Main{
	public static void main(String[] args) {
		Account account = new Account("s-111", "ASMIN", "savings", 1000);
		Employee employee = new Employee(111, "ASMIN", 500, "HYD", account);
		employee.getEmployeDetails();
	}
}
