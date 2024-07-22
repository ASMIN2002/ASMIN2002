package com.asmin.exception;

// try-cath-finally example 2

class I1{
	int m1() {
		try {
			return 10;
		}catch(Exception e) {
			return 20;
		}finally {
			return 30;
		}
	}
}

public class I {
	public static void main(String[] args) {
		I1 i = new I1();
		System.out.println(i.m1());

	}

}
