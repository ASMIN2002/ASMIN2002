package com.asmin.logic_Based_Programming;

import java.util.Scanner;

public class app06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter A number   :  " );
		int num = s.nextInt();
		System.out.println();
		
		int resultevensum = 0;
		int resultoddsum = 0;
		int digit = 0;
		
		while(num !=0) {
			digit = num % 10;
			if(digit % 2 ==0) {
				resultevensum = resultevensum + digit;
			}else {
				resultoddsum = resultoddsum + digit;
			}
			num = num /10;
		}
		System.out.println("Even digit Sum   : "+resultevensum);
		System.out.println("Odd Number Sum   : "+resultoddsum);
	}

}
