package com.durgasoft;

import java.util.Scanner;

public class Cool {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1");		
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		
		System.out.println("Enter a num : ");
		int num = s.nextInt();
		
		switch (num){
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("Enter valid number");
			
		}
	}

}
