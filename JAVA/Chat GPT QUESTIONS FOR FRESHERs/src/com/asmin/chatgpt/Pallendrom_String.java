package com.asmin.chatgpt;

import java.util.Scanner;

public class Pallendrom_String {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter A string    : ");
		String str = scanner.next();
		
		int i = 0;
		int j = str.length()-1;
		
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				System.out.println("Not a Pallendrom String");
				System.exit(0);		
			}
			i++;
			j--;
		}
		System.out.println("PallenDrom String");
	}

}
