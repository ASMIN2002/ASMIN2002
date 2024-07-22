package com.asmin.logic_Based_Programming;

import java.util.Scanner;

public class app05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter A number   : ");
		int num = s.nextInt();
		
		int sum = 0;
		int digit = 0;
		while(num !=0) {
			digit = num % 10;
			sum = sum + digit;
			num = num/10;
		}
		System.out.println("Sum   : "+sum);
	}
}

// 645 = !=0
// 0 = 645 % 10 = 5;		digit = 5;
// 0 = 0 + 5 = 5;			sum = 5;
// 645 = 645/10 = 64;

// 5 = 64 % 10 = 4			digit = 4;
// 5 = 5 + 4 == 9			sum = 9;
// 64 = 64 / 10 = 6;

// 4 = 6 % 10 =6;
// 9 = 9 + 6 = 15;			sum = 15;
// 6 = 6/10 = 0;


