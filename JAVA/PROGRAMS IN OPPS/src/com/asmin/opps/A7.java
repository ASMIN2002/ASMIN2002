package com.asmin.opps;

interface I{
	int i = 10;
}
class I1 implements I{
	
}
public class A7 {

	public static void main(String[] args) {
		System.out.println(I.i);
		System.out.println(I1.i);
	}

}
