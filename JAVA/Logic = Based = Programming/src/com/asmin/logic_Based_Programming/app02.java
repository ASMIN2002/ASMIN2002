package com.asmin.logic_Based_Programming;

import java.util.Scanner;

public class app02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number   :");
		int val1 = s.nextInt();
		System.out.println();
		
		if(val1%2 == 0) {
			System.out.println("It is an even Number .");
		}else {
			System.out.println("It is an Odd Number .");
		}
	}
}
