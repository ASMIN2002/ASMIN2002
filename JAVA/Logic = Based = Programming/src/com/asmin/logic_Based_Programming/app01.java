package com.asmin.logic_Based_Programming;

import java.util.Scanner;

// Dynamic Inputs


public class app01 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.print("Enter First number   :");
	int val1 = s.nextInt();
	
	System.out.print("Enter Second number   :");
	int val2 = s.nextInt();
	
	System.out.print("Enter Third number   :");
	int val3 = s.nextInt();
	
	//int add = val1+val2+val3;
	System.out.println();
	
	System.out.print("ADDITION   :"+(val1+val2+val3));

	}

}
