package com.asmin.chatgpt;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter A number   : ");
		int num = s.nextInt();
		
		int fact = 1;
		
		if(num>0 && num <= 7) {
			for(int i = 1;i<=num; i++) {
				fact = fact*i;
			}
			System.out.println("Factorial   : "+fact);
		}else{
			System.out.println("Please Enter Number Within 1 to 7");
		}
			
	}

}
