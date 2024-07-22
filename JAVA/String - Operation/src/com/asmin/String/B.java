package com.asmin.String;

import java.util.StringTokenizer;

public class B {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("06-04-2024","-");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
