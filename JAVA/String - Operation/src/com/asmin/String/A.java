package com.asmin.String;

import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("ASMIN KULDEEP JENA");
		int count = st.countTokens();
		System.out.println("Tokens Count   : "+count);
		System.out.println();
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
