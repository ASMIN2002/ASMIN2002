package com.asmin.logic_Based_Programming;

import java.util.Scanner;

public class app08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number   : ");
		int num = s.nextInt();
		
		int digit = 0;
		int Evennumcount = 0;
		int Oddnumcount = 0;
		int primenumcount = 0;
		
		while (num !=0) {
			digit = num % 10;
			if(num % 2 == 0) {
				Evennumcount++;
			}else {
				Oddnumcount++;
			}
			if(digit == 2 || digit == 3 || digit == 5 || digit == 7) {
				primenumcount++;
			}
			num = num / 10;
		}
		System.out.println("Prime Number Count      : "+primenumcount);
		System.out.println("Even Number Count       : "+Evennumcount);
		System.out.println("Odd Number Count        : "+Oddnumcount);
	}

}
