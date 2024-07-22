package com.asmin.H;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Book ID : ");
		String id = s.nextLine();
		
		System.out.print("Enter Book Name : ");
		String name = s.nextLine();
		
		System.out.print("Enter Book Author : ");
		String an = s.nextLine();
		
		System.out.print("Enter Book Price  : ");
		float price = s.nextFloat();
		System.out.println();
		
		System.out.println("Book Details");
		System.out.println("---------------");
		System.out.println("Id       : "+id);
		System.out.println("Name     : "+name);
		System.out.println("Author   : "+an);
		System.out.println("Price    : "+price);
		System.out.println("======Thank You=======");
	}

}
