package com.asmin.J;

public class J {

	public static void main(String[] args) {
		
		int a = 34;
		int b = 21;
		int c = a++ + ++b; // 34+22 = 56;
		int d = --a + --b + c; // 34 + 21 + 56 =  111;
		int e = a+ +b + +c +d--; // 34+21+56+111= 222 ;
		int f = -a + b-- + -c - d++; // -34 +21+(-56)- 110 = -34+21-56-110 = -13-56-110 =  -179;
		int sum = a+b+c+d+e+f; // 34+20+56+111+222+(-179) = 34+20+56+111+222-179=264
		
		
		
		System.out.println("SUM   : "+sum);
	}

}
