package com.asmin.Array;

// Declare and Initialize

public class Array1 {
	public static void main(String[] args) {
		float[] flo = {10,20,30,40,50};
		System.out.println(flo);
		System.out.println(flo.length);
		System.out.println(flo[0]);
		System.out.println(flo[2]);
		System.out.println(flo[10-7]);
		// System.out.println(flo[flo.length]); ---> ArrayIndexOutOfBoundsException
		System.out.println(flo[flo.length-5]);
		
	}
}
