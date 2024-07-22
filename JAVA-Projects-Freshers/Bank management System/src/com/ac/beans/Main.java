package com.ac.beans;

import java.util.Scanner;

import com.ac.controller.CustomerController;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("|            Bank Management System                |");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("+--------------------------------------------------+");
			System.out.println("|----------- 1.   CREATE ACCOUNT             : ----|");
			System.out.println("|----------- 2.   VIEW YOUR ACCOUNT DETAILS  : ----|");
			System.out.println("|----------- 3.   DEPOSITE AMMOUNT           : ----|");
			System.out.println("|----------- 4.   WITHDRAW AMMOUNT           : ----|");
			System.out.println("|----------- 5.   DELETE ACCOUNT             : ----|");
			System.out.println("|----------- 6.   GET ATM CARD               : ----|");
			System.out.println("|----------- 7.   EXIT.                      : ----|");
			System.out.println("+--------------------------------------------------+");
			System.out.println();
			System.out.print("|---------------- [ CHOOSE OPTION ] ----------> : ");
			int userOption = scanner.nextInt();
			CustomerController customerController = new CustomerController();

			switch (userOption) {
			case 1:
				System.out.println();
				System.out.println("****************************************************");
				System.out.println("*              |   CREATE ACCOUNT  |               *");
				System.out.println("****************************************************");
				System.out.println();
				customerController.addCustomer();
				break;
			case 2:
				System.out.println();
				System.out.println("****************************************************");
				System.out.println("*              | VIEW YOUR ACCOUNT |               *");
				System.out.println("****************************************************");
				System.out.println();
				customerController.viewDetails();
				System.out.println();
				System.out.println("************* || THANK YOU || **************");
				System.out.println();
				break;
			case 3:
				System.out.println();
				System.out.println("****************************************************");
				System.out.println("*              |  DEPOSITE AMMOUNT  |              *");
				System.out.println("****************************************************");
				System.out.println();
				customerController.depositeAmount();
				System.out.println();
				System.out.println("************* || THANK YOU || **************");
				System.out.println();
				break;
			case 4:
				System.out.println();
				System.out.println("****************************************************");
				System.out.println("*              |  WITHDRAW AMMOUNT  |              *");
				System.out.println("****************************************************");
				System.out.println();
				customerController.withdrawAmount();
				System.out.println();
				System.out.println("************* || THANK YOU || **************");
				System.out.println();
				break;
			case 5:
				System.out.println();
				System.out.println("****************************************************");
				System.out.println("*              |  DELETE ACCOUNT  |                *");
				System.out.println("****************************************************");
				System.out.println();
				customerController.delete();
				System.out.println();
				System.out.println("************* || THANK YOU || **************");
				System.out.println();
				break;
			case 6:
				System.out.println();
				System.out.println("****************************************************");
				System.out.println("*                    |  ATM  |                     *");
				System.out.println("****************************************************");
				customerController.createDataForAtm();
				System.out.println();
				System.out.println("************* || THANK YOU || **************");
				System.out.println();
				break;
			case 7:
				System.out.println();
				System.out.println("****************************************************");
				System.out.println("*                 |  THANK YOU  |                  *");
				System.out.println("****************************************************");
				System.exit(0);
				break;
			
			default:
				System.out.println("+---------------------------------------------------+");
				System.out.println("| WARNING* Please Choose Number In Between 1 to 6 * |");
				System.out.println("+---------------------------------------------------+");
				break;
				
			}
			System.out.print(" FOR MAIN MENU [YES / NO]  : ");
			System.out.println();
			String opt = scanner.next();
			if(opt.equalsIgnoreCase("yes")) {
				continue;
			}else {
				System.out.println("****************************************************");
				System.out.println("*              | HAVE A GOOD DAY  |                *");
				System.out.println("****************************************************");
				System.exit(0);
				break;
				
			}
		}
	
	}

	}


