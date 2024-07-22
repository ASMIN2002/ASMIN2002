package com.asmin.Array;

// Declare then Initialize

public class Array2 {

	public static void main(String[] args) {
		float[] flo = new float[5];
		flo[0] = 10;
		flo[1] = 20;
		flo[2] = 30;
		flo[3] = 40;
		flo[4] = 50;

		System.out.println(flo[2]);
		System.out.println(flo[4]);
		System.out.println(flo[flo.length - 4]);
		System.out.println(flo[10 - 6]);

	}

}
