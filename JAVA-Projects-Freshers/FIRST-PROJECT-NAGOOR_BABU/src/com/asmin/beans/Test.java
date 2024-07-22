package com.asmin.beans;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.asmin.controller.EmployeeController;
import com.asmin.factory.ConnectionFactory;
import com.asmin.factory.EmployeeControllerFactory;
import com.asmin.factory.EmployeeDaoFactory;
import com.asmin.factory.EmployeeServiceFactory;

public class Test {
		static {
			ConnectionFactory.getConnection();
			EmployeeControllerFactory.getEmployeeController();
			EmployeeServiceFactory.getEmployeeService();
			EmployeeDaoFactory.getEmployeeDao();
		}
		
	public static void main(String[] args) {
		System.out.println("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			EmployeeController employeeController = EmployeeControllerFactory.getEmployeeController();
			while (true) {
				System.out.println();
				System.out.println("1. ADD Employee");
				System.out.println("2. SEARCH Employee");
				System.out.println("3. GET All Employee");
				System.out.println("4. UPDATE Employee");
				System.out.println("5. DELETE Employee");
				System.out.println("6. EXIT");
				System.out.println();
				System.out.print("[Your Option]    : ");
				
				
				
				
				int userOption = Integer.parseInt(bufferedReader.readLine());
				
				switch (userOption){
						
					case 1 :   
						System.out.println("ADD Employee Module");
						System.out.println("======================");
						System.out.println();
						employeeController.addEmployee();
						break;
					case 2 :            
						System.out.println("SEARCH Employee Module");
						System.out.println("========================");
						System.out.println();
						employeeController.searchEmployee();
						break;
					case 3 :
						System.out.println("GET All Employee Module");
						System.out.println("=========================");
						System.out.println();
						employeeController.getAllEmployees();
						break;
					case 4 :
						System.out.println("UPDATE Employee Module");
						System.out.println("=========================");
						System.out.println();
						employeeController.updateEmployee();
						break;
					case 5 : 
						System.out.println("DELETE Employee Module");
						System.out.println("========================");
						System.out.println();
						employeeController.deleteEmployee();  
						break;
					case 6 : 
						System.out.println("THANK YOU FOR USING EMPLOYEE MANAGEMENT SYSTEM");
						System.exit(0);
						break;
					default:
						System.out.println("Wrong Option ,Please select the option from 1,2,3,4,5 and 6");
						break;
				}
				
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}

}
