package com.asmin.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("REGISTER HERE");
		System.out.println("=============");
		System.out.print("ENTER YOUR NAME    : ");
		String name = s.next();
		System.out.println("REGISTERED SUCCESSFULLY");
		System.out.println("===================================================");
		System.out.println("  HII ,"+name+" WELCOME TO PROJECTS ENQUIRY_APP");
		System.out.println("===================================================");
		System.out.println("+-------------------------------------------------------------------------------+");
		System.out.println("|                                                                               |");
		System.out.println("|                              PROJECTS ENQUIRY-APP                             |");
		System.out.println("|                                                                               |");
		System.out.println("+-------------------------------------------------------------------------------+");
		
		
		TestController controller = new TestController();
	}
	
	

}
