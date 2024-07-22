package com.asmin.ONE_TO_ONE_SETTER_METHOD_DEPENDENCY;

// setter Method Dependency Injection

public class Setter_method_Dependency_Injection {
	public static void main(String[] args) {
		Account account = new Account();
		account.setAccno("A-111");
		account.setAccHolderName("ASMIN");
		account.setAccType("savings");
		account.setBalance(5000);
		
		Employee employee = new Employee();
		employee.setEno(111);
		employee.setEname("CHINU");
		employee.setEsal(6000.0f);
		employee.setEaddr("BNGL");
		employee.setAccount(account);
		
		employee.getEmployeeDetails();
		
				
	}

}
