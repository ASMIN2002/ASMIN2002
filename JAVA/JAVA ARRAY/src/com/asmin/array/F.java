package com.asmin.array;

// multiDimention by using for and forEach loop

class F{
	public static void main(String[] args){		
		int[][] intArray = {{1,2,3},{2,3,4},{3,4,5}};
		
		for(int row = 0; row < intArray.length; row++){
			for(int col = 0; col < intArray[row].length; col++){
				System.out.print(intArray[row][col]+"\t");
			}
			System.out.println();
		}

		System.out.println();

		for(int[] row: intArray){
			for(int element: row){
				System.out.print(element+"\t");
			}
			System.out.println();
		}

		
		
	}
}

