package com.asmin.student;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("ENTER A NUMBER   : ");
		int num = s.nextInt();
		
		int rev = 0;
		int rem = 0;
		while(num != 0) {
			rem = num%10;
			rev = rev*10+rem;
			num=num/10;	
		}
		System.out.print("YOUR REVERSE NUMBER IS   : "+rev);
		System.out.println();
		if(rev == num) {
			System.out.println("THIS IS A PALENDROM NUMBER");
		}else {
			System.out.println("THIS IS NOT A PALENDROM NUMBER");
		}
		
	}

}
