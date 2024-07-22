package com.asmin.logic_Based_Programming;

import java.util.Scanner;

// Perfect Number  = Paripurno Sonkhya

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter A Number  : ");
		int num = s.nextInt();
		
		int count = 0;
		int orm = num;
		int i = 1;
		while(i<num) {
			if(num%i==0) {
				count=count+i;
			}
			i = i+1;
		}
		if(orm==count) {
			System.out.println(orm+" Is A perfect Number");
		}else {
			System.out.println(orm+" Is Not A perfect Number");
		}

	}

}

// 12 = 1+2+3+4+6+12 = 28
// 6 = 1+2+3+6= 12
// 28 = 1+2+4+7+14+28= 56

