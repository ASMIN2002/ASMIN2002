package com.asmin.logic_Based_Programming;

import java.util.Scanner;

public class app07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter A number   : ");
		int num = s.nextInt();
		
		int digit = 0;
		int Primenumsum = 0;
		int Nonprimenumsum = 0;
		
		while(num != 0) {
			digit = num % 10;
			if(digit == 2 || digit == 3 || digit == 5 || digit == 7) { 
				Primenumsum = Primenumsum + digit; 
			}else {
				Nonprimenumsum = Nonprimenumsum + digit;
			}
			num = num / 10;
		}
		System.out.println();
		System.out.println("Prime Number Sum   : "+Primenumsum);
		System.out.println("Non Prime Number Sum   : "+Nonprimenumsum);

	}

}
