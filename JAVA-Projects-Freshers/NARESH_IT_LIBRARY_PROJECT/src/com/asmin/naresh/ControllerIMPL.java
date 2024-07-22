package com.asmin.naresh;

import java.util.Scanner;

public class ControllerIMPL {

	Scanner s = new Scanner(System.in);

	public void add() {

		System.out.println("HELLO ! ADD BOOK HERE .");
		System.out.println();
		System.out.print("ENTER YOUR BOOK NUMBER         : ");
		int bno = s.nextInt();
		System.out.print("Enter Your BOOK NAME           : ");
		String bname = s.next();
		System.out.print("Enter YOUR BOON AURTHOR NAME   : ");
		String baur = s.next();
		System.out.print("ENTER YOUR BOOK PRICE          : ");
		int price = s.nextInt();
		System.out.println();
		System.out.println("YOUR BOOK ADDED SUCCESSFULLY");
		System.out.println();
		System.out.print("SHOW YOUR BOOK DETAILS [YES/NO]  : ");
		String check = s.next();
		if (check.equalsIgnoreCase("yes")) {
			System.out.println("YOUR BOOK DETAILS");
			System.out.println("-------------------");
			System.out.println("BOOK NUMBER     : " + bno);
			System.out.println("BOOK NAME       : " + bname);
			System.out.println("BOOK AURTHOR    : " + baur);
			System.out.println("BOOK PRICE      : " + price);
			System.out.println();
			System.out.println("THANK YOU");
			System.out.println();
			FrontController controller = new FrontController();
		} else {
			System.out.println();
			System.out.println("THANKS FOR ADDING BOOK");
			FrontController controller = new FrontController();
		}

	}

	public void checkavailablebooks() {
		System.out.println("+-------------------------------------------------------+");
		System.out.println("| BOOKS    | AVAILABALITY | PRICE OF ONE BOOK | AURTHOR |");
		System.out.println("+-------------------------------------------------------+");
		System.out.println("| MATH     | 450          | 850 Ruppes        | A.R.K   |");
		System.out.println("| SCIENCE  | 380          | 960 Ruppes        | J.K     |");
		System.out.println("| ENGLISH  | 1150         | 1250 Ruppes       | P.K.AR  |");
		System.out.println("| COMPUTER | 980          | 560 Ruppes        | C.K.J   |");
		System.out.println("| HISTORY  | 250          | 750 Ruppes        | A.KJ    |");
		System.out.println("+-------------------------------------------------------+");
		System.out.println();
		FrontController controller = new FrontController();
	}

	public void borrowBook() {
		System.out.println("1. Want to Borrow\t\t\t2. Want to Exit");
		int ch = s.nextInt();
		System.out.println();
		
		System.out.println();
		int bill = 0;
		switch (ch) {	
		case 1:
			System.out.println();
			System.out.println("AVAILABLE BOOKS : MATH,SCIENCE,ENGLISH,COMPUTER,HISTORY");
			System.out.print("ENTER BOOK NAME WHICH YOU WANT TO BYE  : ");
			String co = s.next();
			if (co.equalsIgnoreCase("MATH")) {
				System.out.println("ONE BOOK OF MATH PRICE IS   : 450");
				System.out.print("HOW MANY YOU NEED     : ");
				int ne = s.nextInt();
				bill = ne * 450;
				System.out.println();
				System.out.print("YOUR BILL IS   : " + bill);
				System.out.println();
				borrowBook();
			} else if (co.equalsIgnoreCase("SCIENCE")) {
				System.out.println("ONE BOOK OF SCIENCE PRICE IS   : 380");
				System.out.print("HOW MANY YOU NEED     : ");
				int ne = s.nextInt();
				bill = ne * 380;
				System.out.println();
				System.out.print("YOUR BILL IS   : " + bill);
				System.out.println();
				borrowBook();
			} else if (co.equalsIgnoreCase("ENGLISH")) {
				System.out.println("ONE BOOK OF ENGLISH PRICE IS   : 1150");
				System.out.print("HOW MANY YOU NEED     : ");
				int ne = s.nextInt();
				bill = ne * 1150;
				System.out.println();
				System.out.print("YOUR BILL IS   : " + bill);
				System.out.println();
				borrowBook();
			} else if (co.equalsIgnoreCase("COMPUTER")) {
				System.out.println("ONE BOOK OF COMPUTER PRICE IS   : 980");

				System.out.print("HOW MANY YOU NEED     : ");
				int ne = s.nextInt();
				bill = ne * 980;
				System.out.println();
				System.out.print("YOUR BILL IS   : " + bill);
				System.out.println();
				borrowBook();
				System.out.println();
			} else if (co.equalsIgnoreCase("HISTORY")) {
				System.out.println("ONE BOOK OF HISTORY PRICE IS   : 250");

				System.out.print("HOW MANY YOU NEED     : ");
				int ne = s.nextInt();
				bill = ne * 250;
				System.out.println();
				System.out.print("YOUR BILL IS   : " + bill);
				System.out.println();
				borrowBook();
			} else {
				System.out.println();
				System.out.println("BOOK DOES NOT AVAILABLE");
				System.out.println();
				borrowBook();
			}
		case 2:
			System.out.println();
			System.out.println("THANK YOU");
			System.out.println();
			FrontController controller = new FrontController();
		}
	}

	public void sellBook() {
		System.out.println("YOU WILL SELL ONLY THESE BOOKS : MATH,SCIENCE,ENGLISH,COMPUTER,HISTORY\n");
		System.out.println("1. Want to Sell\t\t\t2. Want to Exit");
		int ch = s.nextInt();
		int bill = 0;
		float f = 0;
		switch (ch) {
		case 1:
			System.out.println();
			System.out.print("ENTER BOOK NAME WHICH YOU WANT TO SELL  : ");
			String co = s.next();
			System.out.println();
			if (co.equalsIgnoreCase("MATH")) {
				System.out.println("ONE BOOK OF MATH PRICE IS   : 450");
				System.out.print("HOW MANY YOU WANT TO SELL      : ");
				int ne = s.nextInt();
				bill = ne * 450;
				float gb = (bill/100)*20;
				f=bill-gb;
				System.out.println();
				System.out.println("YOUR TOTAL PRICE IS : "+bill+"\nBUT YOU WILL GET 20% OFF YOUR PRICE");
				System.out.println("YOUR GETTING PRICE IS : "+f);
				System.out.println();
				borrowBook();
				
			} else if (co.equalsIgnoreCase("SCIENCE")) {
				System.out.println("ONE BOOK OF SCIENCE PRICE IS   : 380");
				System.out.print("HOW MANY YOU WANT TO SELL         : ");
				int ne = s.nextInt();
				bill = ne * 380;
				float gb = (bill/100)*20;
				f=bill-gb;
				System.out.println();
				System.out.println("YOUR TOTAL PRICE IS   : "+bill+"\nBUT YOU WILL GET 20% OFF YOUR PRICE");
				System.out.println("YOUR GETTING PRICE IS : "+f);
				System.out.println();
				borrowBook();
			} else if (co.equalsIgnoreCase("ENGLISH")) {
				System.out.println("ONE BOOK OF ENGLISH PRICE IS   : 1150");
				System.out.print("HOW MANY YOU WANT TO SELL         : ");
				int ne = s.nextInt();
				bill = ne * 1150;
				float gb = (bill/100)*20;
				f=bill-gb;
				System.out.println();
				System.out.println("YOUR TOTAL PRICE IS   : "+bill+"\nBUT YOU WILL GET 20% OFF YOUR PRICE");
				System.out.println("YOUR GETTING PRICE IS : "+f);
				System.out.println();
				borrowBook();
			} else if (co.equalsIgnoreCase("COMPUTER")) {
				System.out.println("ONE BOOK OF COMPUTER PRICE IS   : 980");
				System.out.print("HOW MANY YOU WANT TO SELL          : ");
				int ne = s.nextInt();
				bill = ne * 980;
				float gb = (bill/100)*20;
				f=bill-gb;
				System.out.println();
				System.out.println("YOUR TOTAL PRICE IS   : "+bill+"\nBUT YOU WILL GET 20% OFF YOUR PRICE");
				System.out.println("YOUR GETTING PRICE IS : "+f);
				System.out.println();
				borrowBook();
			} else if (co.equalsIgnoreCase("HISTORY")) {
				System.out.println("ONE BOOK OF HISTORY PRICE IS   : 250");
				System.out.print("HOW MANY YOU WANT TO SELL         : ");
				int ne = s.nextInt();
				bill = ne * 250;
				float gb = (bill/100)*20;
				f=bill-gb;
				System.out.println();
				System.out.println("YOUR TOTAL PRICE IS   : "+bill+"\nBUT YOU WILL GET 20% OFF YOUR PRICE");
				System.out.println("YOUR GETTING PRICE IS : "+f);
				System.out.println();
				borrowBook();
			} else {
				System.out.println();
				System.out.println("BOOK DOES NOT AVAILABLE");
				System.out.println();
				borrowBook();
			}
		case 2:
			System.out.println();
			System.out.println("THANK YOU");
			System.out.println();
			FrontController controller = new FrontController();
		}

	}

}
