package com.asmin.JavaFeatures;

interface Math1{
	public int square(int x);
}

public class Functions {
	public static void main(String[] args) {
		Math1 math1 = x -> x*x;
		System.out.println("Square(5)   : "+math1.square(5));
		System.out.println("Square(6)   : "+math1.square(6));

	}

}
