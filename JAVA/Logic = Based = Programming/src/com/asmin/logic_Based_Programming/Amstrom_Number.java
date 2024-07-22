package com.asmin.logic_Based_Programming;

import java.util.Scanner;

public class Amstrom_Number {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number  : ");
		int num = s.nextInt();
		
		int sq=0;
		int digit;
		int sum=0;
		int x = sum;
		while(num != 0) {
			digit = num % 10;
			sq = digit * digit * digit; // 27
			sum = x + sq;  // 
			num = num / 10;
		}
		if(x == num) {
			System.out.println("Number ia amstrom number");
		}else{
			System.out.println("number is not ");
		}
 
	}

}
// 153 = 3

// 27
// 27
// 15

// 5
// 125
// 27+125