package com.asmin.naresh;

import java.util.Scanner;

public class FrontController {

	Scanner s = new Scanner(System.in);
	ControllerIMPL controllerIMPL = new ControllerIMPL();
	public FrontController(){
		
		System.out.println("1.  ADD A BOOK TO LIBRARY");
		System.out.println("2.  DISPLAY ALL AVAILABLE BOOKS ");
		System.out.println("3.  ALLOW A MEMBER TO BYE A BOOK ");
		System.out.println("4.  ALLOW A MEMBER TO SELL A BOOK ");
		System.out.println("5.  EXIT  !");
		System.out.println();
		System.out.print("ENTER YOUR CHOICE  : ");
		int choice = s.nextInt();
		System.out.println();

		switch(choice) {
		case 1:
			controllerIMPL.add();
			break;
		case 2:
			controllerIMPL.checkavailablebooks();
			break;
		case 3:
			controllerIMPL.borrowBook();
			break;
		case 4:
			controllerIMPL.sellBook();
			break;
		case 5:
			System.out.println();
			System.out.println("THANK YOU FOR USING LIBRARY MANAGEMENT SYSTEM");
			System.exit(0);
		}

	}
	
}
