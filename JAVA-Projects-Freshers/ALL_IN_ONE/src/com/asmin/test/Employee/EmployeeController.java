package com.asmin.test.Employee;

import java.util.Scanner;

import com.asmin.test.TestController;

public class EmployeeController {
	Scanner s = new Scanner(System.in);

	public void student() {

		System.out.println();
		System.out.println("\t\t\t+-------------------------+");
		System.out.println("\t\t\t| 1. ADD EMPLOYEE         |");
		System.out.println("\t\t\t+-------------------------+");
		System.out.println("\t\t\t| 2. SEARCH EMPLOYEE      |");
		System.out.println("\t\t\t+-------------------------+");
		System.out.println("\t\t\t| 3. UPDATE EMPLOYEE      |");
		System.out.println("\t\t\t+-------------------------+");
		System.out.println("\t\t\t| 4. DELETE EMPLOYEE      |");
		System.out.println("\t\t\t+-------------------------+");
		System.out.println("\t\t\t| 5. BACK TO HOME         |");
		System.out.println("\t\t\t+-------------------------+\n");

		System.out.print(" CHOOSE NUMBER WHICH YOU WANT TO DO  : ");
		int choice = s.nextInt();
		System.out.println("=================================================================================");
		EmployeeImpl employeeImpl = new EmployeeImpl();
		// EmployeeController empcontroller = new EmployeeController();

		switch (choice) {
		case 1:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|                        ADD EMPLOYEE HERE                        |");
			System.out.println("\t+=================================================================+\n");
			employeeImpl.addEmployee();
			student();
			break;
		case 2:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|                      SEARCH EMPLOYEE HERE                       |");
			System.out.println("\t+=================================================================+\n");
			employeeImpl.searchEmployee();
			student();
			break;
		case 3:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|                      UPDATE EMPLOYEE HERE                       |");
			System.out.println("\t+=================================================================+\n");
			employeeImpl.updateEmployee();
			student();
			break;
		case 4:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|                      DELETE EMPLOYEE HERE                       |");
			System.out.println("\t+=================================================================+\n");
			employeeImpl.deleteEmployee();
			student();
			break;
		case 5:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|          THANKYOU FOR USING EMPLOYEE MANAGEMENT SYSTEM          |");
			System.out.println("\t+=================================================================+\n");
			TestController testcontroller = new TestController();
			break;
		default:
			System.out.println("=================================================================================");
			System.out.println("  *PLEASE CHOOSE OPTION WITHIN 1 TO 5");
			System.out.println("=================================================================================");
			student();
			break;
		}

	}

}
