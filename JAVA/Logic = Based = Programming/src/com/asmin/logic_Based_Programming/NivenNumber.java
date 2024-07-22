package com.asmin.logic_Based_Programming;

import java.util.Scanner;

// Niven Number = sum of all digit is divisible to the Original number

public class NivenNumber {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter A number   : ");
	int num = s.nextInt();
	
	int count = 0;
	int orm = num;
	
	while (num !=0) {
		count = count + num%10;
		num = num / 10;
		
	}
	if(orm%count == 0) {
		System.out.println("Number Is A niven Number ");
	}else {
		System.out.println("Number Is Not A niven Number");
	}
	}

}

// 636
// 0 = 0 + 6;   count = 6;
// 636/10=63;

// 63
// 6 = 6+3;    count = 9;
// 63/10=6;

// 6
// 9 = 9+6;   count = 15;
// 6/10 =0;

 