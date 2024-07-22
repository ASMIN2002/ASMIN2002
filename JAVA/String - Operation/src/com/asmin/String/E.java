package com.asmin.String;

public class E {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);
		
		String str3 = new String("xyz");
		String str4 = new String("xyz");
		System.out.println(str3 == str4);
	}
}
  