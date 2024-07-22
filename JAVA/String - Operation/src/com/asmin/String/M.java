package com.asmin.String;

public class M {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("xyz");
		String str3 = new String("abc");
		System.out.println(str1.compareTo(str2));// abc.compareto(xyz); abc comes first //  ==  -ve
		System.out.println(str2.compareTo(str3));// xyz.compareto(abc); abc comes first //  ==  +ve
		System.out.println(str3.compareTo(str1));// abc.compareto(abc); both are same //  ==  0

	}

}
