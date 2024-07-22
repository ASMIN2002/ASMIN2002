package com.asmin.Wrapper;

//  String Type ----- > Object type
// public XXX(String Value);

public class C {

	public static void main(String[] args) {
		String str = "10";
		Integer integer = new Integer(str);
		System.out.println(str+"   "+integer);
	}

}
