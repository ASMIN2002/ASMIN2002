package com.asmin.chatgpt;

import java.util.Scanner;

public class FibboNacci_Series {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter A number   : ");
		int num = scanner.nextInt();
		System.out.println();
		int f = 1,s = 1,t;
		System.out.print(f+"  ");
		System.out.print(s+"  ");
		for(int i = 3;i<=num;i++) {
			t=f+s;
			System.out.print(t+"  ");
			f=s;
			s=t;
		}

	}

}
