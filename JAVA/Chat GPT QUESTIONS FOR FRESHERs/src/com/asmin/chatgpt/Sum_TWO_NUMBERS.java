package com.asmin.chatgpt;

import java.util.Scanner;

public class Sum_TWO_NUMBERS {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter first Number   : ");
		int num1 = s.nextInt();
		
		System.out.print("Enter Second Number  : ");
		int num2 = s.nextInt();
		
		int sum = num1+num2;
		System.out.println("Sum   : "+sum);

	}

}
