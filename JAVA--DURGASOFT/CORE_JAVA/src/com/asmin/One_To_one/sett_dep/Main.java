package com.asmin.One_To_one.sett_dep;

public class Main {

	public static void main(String[] args) {
		Account account = new Account();
		account.setAccNo("s-111");
		account.setAccHolderName("CHINMAY");
		account.setAccType("Savings");
		account.setBalance(5000);
		
		Employee employee = new Employee();
		employee.setEno(111);
		employee.setEname("CHINMAY");
		employee.setEsal(2000);
		employee.setEaddr("HYD");
		employee.setAccount(account);
		
		employee.getEmployeeDetails();
		
	}

}