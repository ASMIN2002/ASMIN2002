package com.asmin.String;
class K1{
	
}
public class K {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		
		K1 k1 = new K1();
		K1 k2 = new K1();
		
		String str1 = new String("ASMIN");
		String str2 = new String("ASMIN");
		
		System.out.println(i==j);// false
		System.out.println(k1==k2);// false
		System.out.println(str1==str2);// false
		System.out.println();
		
		System.out.println(k1.equals(k2));// false
		System.out.println(str1.equals(str2));// true

	}

}
