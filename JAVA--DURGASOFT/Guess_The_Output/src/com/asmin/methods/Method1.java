package com.asmin.methods;

class M1{
	int sum = 0;
	public int addTwoInt(int a,int b) {
		sum = a+b;
		return sum;
	}
}
public class Method1 {
	public static void main(String[] args) {
		M1 m1 = new M1();
		int s = m1.addTwoInt(1, 2);
		System.out.println("Sum   : "+s);
	}
}
