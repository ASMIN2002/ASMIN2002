package com.asmin.logic_Based_Programming;

import java.util.Scanner;

// Duck Number is a number , it has contains '0' in its body.If '0' is leading a number then that 0 is not countable.
// 1234 = Not a Duck Number
// 1205 = is a Duck number
// 0975 = Not a duck number

public class DuckNumber{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter A Number  : ");
		int num = s.nextInt();
		
		boolean count = false;
		while(num%10==0) {
			count = true;
			num = num/10;
		}
		if(count == true) {
			System.out.println("Number Is A duck number");
		}else {
			System.out.println("Number Is Not A Duck number");
		}

	}

}
