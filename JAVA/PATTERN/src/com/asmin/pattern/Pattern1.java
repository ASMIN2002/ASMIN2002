package com.asmin.pattern;

import java.util.Iterator;

public class Pattern1 {

	public static void main(String[] args) {
		for (int i = 1;i<=10;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println(); 	
		}
		
System.out.println();
		for (int i = 1;i<=15 ;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println(); 	
		}
	}

}
