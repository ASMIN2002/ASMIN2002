package com.chinu.java;

public class Lowest_nUmber {
	public static void main(String[] args) {
		int[] arr = {10,30,40,60,70,58,200};
		
		int min = arr[0];
		for(int index = 1;index<arr.length;index++) {
			if(arr[index]<min) {
				min = arr[index];
			}
			System.out.print(arr[index]+"  \n");
		}
		System.out.println();
		System.out.println("MIN   : "+min);
	}

}

