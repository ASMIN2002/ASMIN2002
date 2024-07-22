package com.asmin.JavaFeatures;
//
//interface Math{
//	public boolean evenorNot(int num);
//}

import java.util.function.Predicate;

public class Predicates {
	public static void main(String[] args) {
		Predicate<Integer> p = num -> num%2 == 0;
		
		System.out.println("9 is Even ?   : "+p.test(9));
		System.out.println("10 is Even ?  : "+p.test(10));
		
	}

}
