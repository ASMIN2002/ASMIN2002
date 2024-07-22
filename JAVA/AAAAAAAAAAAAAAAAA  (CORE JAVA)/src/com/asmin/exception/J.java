package com.asmin.exception;

// try-cath-finally example 3

class J1{
	int m1() {
		try {
			float f = 100/0;
			return 10;
		}catch(Exception e) {
			return 20;
		}finally {
			return 30;
		}
	}
}

public class J {
	public static void main(String[] args) {
		J1 i = new J1();
		System.out.println(i.m1());

	}

}

