package com.asmin.G;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Id       : ");
		int num = s.nextInt();
		
		System.out.print("Enter Name   : ");
		String name = s.next();
		
		System.out.print("Enter MailId : ");
		String email = s.next();
		
		System.out.print("Enter ph     : ");
		long ph = s.nextLong();
		
		System.out.println();
		System.out.println("******* Details *******");
		System.out.println("--------------------------");
		System.out.println("ID       : "+num);
		System.out.println("NAME     : "+name);
		System.out.println("EMAIL    : "+email);
		System.out.println("PHONE    : "+ph);
	}

}
