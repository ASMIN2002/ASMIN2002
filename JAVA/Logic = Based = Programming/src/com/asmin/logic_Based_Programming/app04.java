package com.asmin.logic_Based_Programming;

import java.util.Scanner;

public class app04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number   : ");
		int num = s.nextInt();
		
		int digit = 0;
		String result = "";
		while(num != 0) {
			digit = num % 10;
			result = digit+" "+result;
			num = num/10;
		}
		System.out.println("Result   : "+result);
		

	}

}
// 657 = 
// 0 = 657 % 10 = 7         digit = 7;
// null = 7 +" "+ null;    result = 7 ; 
// 657 / 10 = 65

// 7= 65 % 10= 5			digit = 5;
//7 =5+" "+7 = 5 7			result = 5 7;
// 65 = 65 /10=6

//5 = 6%10= 6				digit = 6;
// 5 7=6+" "+5 7;			result = 6 5 7
// 6 = 6/10 =0;