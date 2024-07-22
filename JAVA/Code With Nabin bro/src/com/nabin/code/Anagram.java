package com.nabin.code;

import java.util.Arrays;

public class Anagram{
	public static void main(String[] args) {
		String str1 = "LISTEN";
		String str2 = "SILENT";
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		if(ch1.length != ch2.length) {
			System.out.println("not Anagram");
			System.exit(0);
		}
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int index =0;index <ch1.length;index++) {
			if(ch1[index] != ch2[index]) {
				System.out.println("Not Anagram");
				System.exit(0);
			}
		}
		System.out.println("Anagram");
	}

}
