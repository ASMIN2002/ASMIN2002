package com.asmin.test;

import java.util.Scanner;

import com.asmin.test.Employee.Employee;
import com.asmin.test.Hospital.Hospital;
import com.asmin.test.library.Library;

public class TestController {
	Scanner s = new Scanner(System.in);
	public TestController(){
		System.out.println("+-------------------------------------------------------------------------------+");
		System.out.print("| 1. EMPLOYEE MANAGEMENT SYSTEM\t\t");
		System.out.print(" 2. HOSPITAL MANAGEMENT SYSTEM\t\t|\n");
		System.out.print("|                                                                               |\n");
		System.out.print("| 3. LIBRARY MANAGEMENT SYSTEM\t\t");
		System.out.print(" 4. STUDENT MANAGEMENT SYSTEM\t\t|\n");
		System.out.print("|                                                                               |\n");
		System.out.print("| 5. EXIT                                                                       |\n");
		System.out.println("+-------------------------------------------------------------------------------+\n");
		
		System.out.print("\tCHOOSE THE NUMBER OF PROJECT WHICH YOU WANT TO TRY   : ");
		int choose = s.nextInt();
		System.out.println("=================================================================================");
		System.out.println();
		
		switch(choose) { 
		case 1:
			Employee employee = new Employee();
			break;
		case 2:
			Hospital hospital = new Hospital();
			break;
		case 3:
			Library library = new Library();
			break;
		case 4:
			
			break;
		case 5:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|                           THANK YOU                             |");
			System.out.println("\t+=================================================================+");
			System.out.println();
			System.exit(0);
		default:
			System.out.println("=================================================================================");
			System.out.println("\tPLEASE CHOOSE WITHIN 1 TO 5");
			System.out.println("=================================================================================");
			new TestController();
			break;
		}
		
		
		
	}
}
