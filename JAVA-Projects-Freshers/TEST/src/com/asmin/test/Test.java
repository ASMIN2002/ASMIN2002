package com.asmin.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("1. Register   : \t\t");
		System.out.print("2. LOGIN      : \n");
		System.out.print("CHOOSE   : ");
		int choice = s.nextInt();
		
		Front front = new Front();
		
		switch(choice) {
		case 1:
			System.out.println("REGISTER");
			front.register();
			break;
		case 2:
			System.out.println("LOGIN");
			front.login();
			break;
		}
		
	}
}