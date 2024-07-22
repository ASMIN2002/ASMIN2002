package com.asmin.test.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class LibraryImpl {
	Scanner s = new Scanner(System.in);
	

	public void add() {
		System.out.print("  ENTER YOUR BOOK NUMBER         : ");
		String bno = s.next();
		System.out.print("  Enter Your BOOK NAME           : ");
		String bname = s.next();
		System.out.print("  Enter YOUR BOON AURTHOR NAME   : ");
		String baur = s.next();
		System.out.print("  ENTER YOUR BOOK PRICE          : ");
		int bprice = s.nextInt();
		System.out.println();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/TEST", "root",
					"Asmin@2002");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into lib values(?,?,?,?)");

			preparedStatement.setString(1, bno);
			preparedStatement.setString(2, bname);
			preparedStatement.setString(3, baur);
			preparedStatement.setFloat(4, bprice);

			int add = preparedStatement.executeUpdate();
			if (add > 0) {
				System.out.println();
				System.out.println(" +-----------------------------------------------------------------+");
				System.out.println(" |              BOOK SUCCESSFULLY ADDED IN LIBRARY                 |");
				System.out.println(" +-----------------------------------------------------------------+\n");
			} else {
				System.out.println("Note* SOME ERROR FOUND, BOOK DOES NOT ADDED SUCCESSFULLY");
			}
		} catch (Exception e) {

		}
		System.out.println("=================================================================================");

	}

	public void checkavailablebooks() {
		System.out.println("\t\t+-------------------------------------------------------+");
		System.out.println("\t\t| BOOKS    | AVAILABALITY | PRICE OF ONE BOOK | AURTHOR |");
		System.out.println("\t\t+-------------------------------------------------------+");
		System.out.println("\t\t| MATH     | 450          | 850 Ruppes        | A.R.K   |");
		System.out.println("\t\t| SCIENCE  | 380          | 960 Ruppes        | J.K     |");
		System.out.println("\t\t| ENGLISH  | 1150         | 1250 Ruppes       | P.K.AR  |");
		System.out.println("\t\t| COMPUTER | 980          | 560 Ruppes        | C.K.J   |");
		System.out.println("\t\t| HISTORY  | 250          | 750 Ruppes        | A.KJ    |");
		System.out.println("\t\t+-------------------------------------------------------+");
		System.out.println();
		System.out.println("=================================================================================");
	}

	public void borrowBook() {
		System.out.println("\t\t1. WANT TO BYE  \t\t2. WANT TO EXIT  \n");
		System.out.print("\t\t CHOOSE HERE    : ");
		int ch = s.nextInt();
		System.out.println();
		int bill = 0;
		switch (ch) {
		case 1:
			System.out.println();
			System.out.println("\t+===========================================================+");
			System.out.println("\t| AVAILABLE BOOKS :   MATH,SCIENCE,ENGLISH,COMPUTER,HISTORY |");
			System.out.println("\t+===========================================================+\n");
			System.out.print("\tENTER BOOK NAME WHICH YOU WANT TO BYE  : ");

			String co = s.next();
			if (co.equalsIgnoreCase("MATH")) {
				System.out.println("\t+=========================================================+");
				System.out.println("\tONE BOOK OF MATH PRICE IS   : 450");
				System.out.print("\tHOW MANY YOU NEED     : ");
				int ne = s.nextInt();
				bill = ne * 450;
				System.out.println();
				System.out.print("\tYOUR BILL IS   : " + bill);
				System.out.println("\t+=========================================================+\n");
				borrowBook();
			} else if (co.equalsIgnoreCase("SCIENCE")) {
				System.out.println("\t+=========================================================+");
				System.out.println("\tONE BOOK OF SCIENCE PRICE IS   : 380");
				System.out.print("\tHOW MANY YOU NEED     : ");
				int ne = s.nextInt();
				bill = ne * 380;
				System.out.print("\tYOUR BILL IS   : " + bill);
				System.out.println();
				System.out.println("\t+=========================================================+\n");
				borrowBook();
			} else if (co.equalsIgnoreCase("ENGLISH")) {
				System.out.println("\t+=========================================================+");
				System.out.println("\tONE BOOK OF ENGLISH PRICE IS   : 1150");
				System.out.print("\tHOW MANY YOU NEED     : ");
				int ne = s.nextInt();
				bill = ne * 1150;
				System.out.print("\tYOUR BILL IS   : " + bill);
				System.out.println();
				System.out.println("\t+=========================================================+\n");
				borrowBook();
			} else if (co.equalsIgnoreCase("COMPUTER")) {
				System.out.println("\t+=========================================================+");
				System.out.println("\tONE BOOK OF COMPUTER PRICE IS   : 980");
				System.out.print("\tHOW MANY YOU NEED     : ");
				int ne = s.nextInt();
				bill = ne * 980;
				System.out.print("\tYOUR BILL IS   : " + bill);
				System.out.println();
				System.out.println("\t+=========================================================+\n");
				borrowBook();
				System.out.println();
			} else if (co.equalsIgnoreCase("HISTORY")) {
				System.out.println("\t+=========================================================+");
				System.out.println("\tONE BOOK OF HISTORY PRICE IS   : 250");
				System.out.print("\tHOW MANY YOU NEED     : ");
				int ne = s.nextInt();
				bill = ne * 250;
				System.out.print("\tYOUR BILL IS   : " + bill);
				System.out.println();
				System.out.println("\t+=========================================================+\n");
				borrowBook();
			} else {
				System.out.println();
				System.out.println("BOOK DOES NOT AVAILABLE");
				System.out.println();
				borrowBook();
			}
			break;
		case 2:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|                            THANK YOU                            |");
			System.out.println("\t+=================================================================+\n");
			System.out.println();
			break;

		}
	}

	public void sellBook() {
		System.out.println("\t\t1. WANT TO SELL  \t\t2. WANT TO EXIT  \n");
		System.out.print("\t\t CHOOSE HERE    : ");
		int ch = s.nextInt();
		int bill = 0;
		float f = 0;
		switch (ch) {
		case 1:
			System.out.println();
			System.out.println("\t+================================================================+");
			System.out.println("\t| SELL ONLY THESE BOOKS :  MATH,SCIENCE,ENGLISH,COMPUTER,HISTORY |");
			System.out.println("\t+================================================================+\n");
			System.out.print("\tENTER BOOK NAME WHICH YOU WANT TO SELL  : ");
			String co = s.next();
			System.out.println();
			if (co.equalsIgnoreCase("MATH")) {
				System.out.println("\t+================================================================+");
				System.out.println("\tONE BOOK OF MATH PRICE IS    : 450");
				System.out.print("\tHOW MANY YOU WANT TO SELL      : ");
				int ne = s.nextInt();
				bill = ne * 450;
				float gb = (bill / 100) * 20;
				f = bill - gb;
				System.out.println("\tYOUR TOTAL PRICE IS : " + bill + "\n\tBUT YOU WILL GET 20% OFF YOUR PRICE");
				System.out.println("\tYOUR GETTING PRICE IS : " + f);
				System.out.println();
				System.out.println("\t+================================================================+\n");
				borrowBook();

			} else if (co.equalsIgnoreCase("SCIENCE")) {
				System.out.println("\t+================================================================+");
				System.out.println("\tONE BOOK OF SCIENCE PRICE IS    : 380");
				System.out.print("\tHOW MANY YOU WANT TO SELL         : ");
				int ne = s.nextInt();
				bill = ne * 380;
				float gb = (bill / 100) * 20;
				f = bill - gb;
				System.out.println("\tYOUR TOTAL PRICE IS   : " + bill + "\n\tBUT YOU WILL GET 20% OFF YOUR PRICE");
				System.out.println("\tYOUR GETTING PRICE IS : " + f);
				System.out.println();
				System.out.println("\t+================================================================+\n");
				borrowBook();
			} else if (co.equalsIgnoreCase("ENGLISH")) {
				System.out.println("\t+================================================================+");
				System.out.println("\tONE BOOK OF ENGLISH PRICE IS    : 1150");
				System.out.print("\tHOW MANY YOU WANT TO SELL         : ");
				int ne = s.nextInt();
				bill = ne * 1150;
				float gb = (bill / 100) * 20;
				f = bill - gb;
				System.out.println("\tYOUR TOTAL PRICE IS   : " + bill + "\n\tBUT YOU WILL GET 20% OFF YOUR PRICE");
				System.out.println("\tYOUR GETTING PRICE IS : " + f);
				System.out.println();
				System.out.println("\t+================================================================+\n");
				borrowBook();
			} else if (co.equalsIgnoreCase("COMPUTER")) {
				System.out.println("\t+================================================================+");
				System.out.println("\tONE BOOK OF COMPUTER PRICE IS    : 980");
				System.out.print("\tHOW MANY YOU WANT TO SELL          : ");
				int ne = s.nextInt();
				bill = ne * 980;
				float gb = (bill / 100) * 20;
				f = bill - gb;
				System.out.println("\tYOUR TOTAL PRICE IS   : " + bill + "\n\tBUT YOU WILL GET 20% OFF YOUR PRICE");
				System.out.println("\tYOUR GETTING PRICE IS : " + f);
				System.out.println();
				System.out.println("\t+================================================================+\n");
				borrowBook();
			} else if (co.equalsIgnoreCase("HISTORY")) {
				System.out.println("\t+================================================================+");
				System.out.println("\tONE BOOK OF HISTORY PRICE IS    : 250");
				System.out.print("\tHOW MANY YOU WANT TO SELL         : ");
				int ne = s.nextInt();
				bill = ne * 250;
				float gb = (bill / 100) * 20;
				f = bill - gb;
				System.out.println("YOUR TOTAL PRICE IS   : " + bill + "\n\tBUT YOU WILL GET 20% OFF YOUR PRICE");
				System.out.println("YOUR GETTING PRICE IS : " + f);
				System.out.println();
				System.out.println("\t+================================================================+\n");
				borrowBook();
			} else {
				System.out.println();
				System.out.println("\t+=================================================================+");
				System.out.println("\t|                        BOOK DOES NOT ALLOW                      |");
				System.out.println("\t+=================================================================+\n");
				
				borrowBook();
			}
			break;
		case 2:
			System.out.println();
			System.out.println("\t+=================================================================+");
			System.out.println("\t|                           THANK YOU                             |");
			System.out.println("\t+=================================================================+");
			System.out.println();
			break;
		}
	}
}
