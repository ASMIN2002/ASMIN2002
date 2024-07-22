package com.nabin.code;

public class Palindrom_String{
	public static void main(String[] args) {
		String str = "Asmin";
		char[] ch= str.toCharArray();
		for(int i = ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}

	}

}
