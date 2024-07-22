package com.asmin.test.student;

import java.util.Scanner;

public class StudentController {
	
	Scanner s = new Scanner(System.in);
	
	public void student() {
		System.out.println();
		System.out.println("\t\t\t+-------------------------+");
		System.out.println("\t\t\t| 1. ADD STUDENT          |");
		System.out.println("\t\t\t+-------------------------+");
		System.out.println("\t\t\t| 2. SEARCH STUDENT       |");
		System.out.println("\t\t\t+-------------------------+");
		System.out.println("\t\t\t| 3. UPDATE STUDENT       |");
		System.out.println("\t\t\t+-------------------------+");
		System.out.println("\t\t\t| 4. DELETE STUDENT       |");
		System.out.println("\t\t\t+-------------------------+");
		System.out.println("\t\t\t| 5. BACK TO HOME         |");
		System.out.println("\t\t\t+-------------------------+\n");
		
		System.out.print(" CHOOSE NUMBER WHICH YOU WANT TO DO  : ");
		int choice = s.nextInt();
		System.out.println("=================================================================================");
		
		
	}
}
