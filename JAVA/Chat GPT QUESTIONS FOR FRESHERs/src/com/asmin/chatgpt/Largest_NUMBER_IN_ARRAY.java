package com.asmin.chatgpt;

public class Largest_NUMBER_IN_ARRAY {
	public static void main(String[] args) {
	
		int[] arr = {10,40,50,400,500,47,200,1000};
		
		int max = arr[0];
		
		for(int index = 1;index<arr.length;index++) {
			if(arr[index]>max) {
				max = arr[index];
			}
			System.out.print(arr[index]+"   ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Largest Number In this Array is   :  "+max);
	}

}
