package com.asmin.logic_Based_Programming;

import java.util.Scanner;

public class app09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number    : ");
		int num = s.nextInt();
		
		int digit = 0;
		int rev = 0;
		int orn = num;
		while(num != 0) {
			digit = num %10;
			rev = rev*10+digit;
			num = num/10;
		}
		System.out.println("Reverse Number is  :  "+rev);
		if(orn==rev) {
			System.out.println(orn+" is a Palindrome Number ");
		}else{
			System.out.println(orn+" is not a Palindrome Number ");
		}
	}

}
