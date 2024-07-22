package com.asmin.test.library;

import java.util.Scanner;

import com.asmin.test.TestController;

public class LibraryController {
	Scanner s = new Scanner(System.in);
	public void libaray() {
		System.out.println();
		System.out.println("\t\t\t+----------------------------------+");
		System.out.println("\t\t\t| 1. ADD A BOOK TO LIBRARY         |");
		System.out.println("\t\t\t+----------------------------------+");
		System.out.println("\t\t\t| 2. DISPLAY ALL AVAILABLE BOOKS   |");
		System.out.println("\t\t\t+----------------------------------+");
		System.out.println("\t\t\t| 3. ALLOW A MEMBER TO BYE A BOOK  |");
		System.out.println("\t\t\t+----------------------------------+");
		System.out.println("\t\t\t| 4. ALLOW A MEMBER TO SELL A BOOK |");
		System.out.println("\t\t\t+----------------------------------+");
		System.out.println("\t\t\t| 5. BACK TO HOME                  |");
		System.out.println("\t\t\t+----------------------------------+\n");

		System.out.print(" CHOOSE NUMBER WHICH YOU WANT TO DO  : ");
		int choice = s.nextInt();
		System.out.println("=================================================================================");
		LibraryImpl libraryImpl = new LibraryImpl();
		
		switch (choice) {
		case 1:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|                         ADD BOOK HERE                           |");
			System.out.println("\t+=================================================================+\n");
			libraryImpl.add();
			libaray();
			break;
		case 2:
			System.out.println();
			System.out.println("\t  +=================================================================+");
			System.out.println("\t  |                     AVAILABLE BOOKS HERE                        |");
			System.out.println("\t  +=================================================================+\n");
			libraryImpl.checkavailablebooks();
			libaray();
			break;
		case 3:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|                        BYE BOOK HERE                            |");
			System.out.println("\t+=================================================================+\n");
			libraryImpl.borrowBook();
			libaray();
			break;
		case 4:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|                        SELL BOOK HERE                           |");
			System.out.println("\t+=================================================================+\n");
			libraryImpl.sellBook();
			libaray();
			break;
		case 5:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|          THANKYOU FOR USING LIBRARY MANAGEMENT SYSTEM           |");
			System.out.println("\t+=================================================================+\n");
			TestController testcontroller = new TestController();
			break;
		default:
			System.out.println("=================================================================================");
			System.out.println("  *PLEASE CHOOSE OPTION WITHIN 1 TO 5");
			System.out.println("=================================================================================");
			libaray();
			break;
		}
	}
}
