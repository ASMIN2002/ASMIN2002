package com.asmin.test.Hospital;

import java.util.Scanner;

import com.asmin.test.TestController;

public class HospitalController {
	Scanner s = new Scanner(System.in);

	public void hospital() {
		System.out.println();
		System.out.println("\t\t\t+-------------------------+");
		System.out.println("\t\t\t| 1. ADD PATIENT          |");
		System.out.println("\t\t\t+-------------------------+");
		System.out.println("\t\t\t| 2. SEARCH PATIENT       |");
		System.out.println("\t\t\t+-------------------------+");
		System.out.println("\t\t\t| 3. UPDATE PATIENT       |");
		System.out.println("\t\t\t+-------------------------+");
		System.out.println("\t\t\t| 4. DELETE PATIENT       |");
		System.out.println("\t\t\t+-------------------------+");
		System.out.println("\t\t\t| 5. BACK TO HOME         |");
		System.out.println("\t\t\t+-------------------------+\n");

		System.out.print(" CHOOSE NUMBER WHICH YOU WANT TO DO  : ");
		int choice = s.nextInt();
		System.out.println("=================================================================================");
		HospitalImpl hospitalImpl = new HospitalImpl();
		switch (choice) {
		case 1:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|                        ADD PATIENT HERE                         |");
			System.out.println("\t+=================================================================+\n");
			hospitalImpl.addPat();
			hospital();
			break;
		case 2:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|                      SEARCH PATIENT HERE                        |");
			System.out.println("\t+=================================================================+\n");
			hospitalImpl.searchPat();
			hospital();
			break;
		case 3:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|                      UPDATE PATIENT HERE                        |");
			System.out.println("\t+=================================================================+\n");
			hospitalImpl.updatePat();
			hospital();
			break;
		case 4:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|                      DELETE PATIENT HERE                        |");
			System.out.println("\t+=================================================================+\n");
			hospitalImpl.deletePat();
			hospital();
			break;
		case 5:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|          THANKYOU FOR USING HOSPITAL MANAGEMENT SYSTEM          |");
			System.out.println("\t+=================================================================+\n");
			TestController testcontroller = new TestController();
			break;
		default:
			System.out.println("=================================================================================");
			System.out.println("  *PLEASE CHOOSE OPTION WITHIN 1 TO 5");
			System.out.println("=================================================================================");
			hospital();
			break;
		}
	}
}
