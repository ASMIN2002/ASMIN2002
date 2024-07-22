package com.asmin.array;

// MultiDimentional Array
class E{
	public static void main(String[] args){		
		//int[][] intArray = {{1,2,3},{2,3,4},{3,4,5}};   ==> Declare and Initialize

		int[][] intArray = new int[3][3];
		intArray[0][0] = 1;
		intArray[0][1] = 2;
		intArray[0][2] = 3;

		intArray[1][0] = 2;
		intArray[1][1] = 3;
		intArray[1][2] = 4;

		intArray[2][0] = 3;
		intArray[2][1] = 4;
		intArray[2][2] = 5;

		System.out.println(intArray);
		System.out.println(intArray.length);
		System.out.println(intArray[2]);
		System.out.println(intArray[2].length);
		System.out.println(intArray[1][2]);
		//System.out.println(intArray[2][3]);--> ArrayIndexOutOfBoundsException
		//System.out.println(intArray[3][1]);--> ArrayIndexOutOfBoundsException
		System.out.println(intArray[intArray.length-1][intArray.length-2]);
		//System.out.println(intArray[intArray[1][0]+1][intArray[2].length-1]); --> ArrayIndexOutOfBoundsException
		System.out.println(intArray[intArray[0].length-2][intArray[1].length-1]);
	}
}

