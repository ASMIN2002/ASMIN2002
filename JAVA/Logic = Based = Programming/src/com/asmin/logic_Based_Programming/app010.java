package com.asmin.logic_Based_Programming;

import java.util.Scanner;

public class app010 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.print("Enter a number  : ");
	int num = s.nextInt();
	
	System.out.print("Enter Your Digit  : ");
	int digit = s.nextInt();
	
	int count = 0;
	
	 while(num!=0) {
		if(num%10==digit) {
			count++;
		} 
		num = num/10;
	 }
	 System.out.println("Count of your Digit is  : "+count);
	
	}

}
