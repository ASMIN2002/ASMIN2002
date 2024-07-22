package com.asmin.logic_Based_Programming;

import java.util.Scanner;

public class app03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Course Name    : ");
		String str = s.next();
		
		System.out.print("Number Of Enquiries  : ");
		int enq = s.nextInt();
		
		if(enq>=30 && enq<50) {
			System.out.print("**");
		}else if(enq>=50 && enq < 70) {
			System.out.print("***");
		}else if(enq>= 70 && enq < 100) {
			System.out.println("****");
		}else {
			System.out.println("No Rating yet");
		}
	}

}
