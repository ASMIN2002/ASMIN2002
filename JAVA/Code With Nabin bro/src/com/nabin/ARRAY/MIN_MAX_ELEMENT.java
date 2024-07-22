package com.nabin.ARRAY;

public class MIN_MAX_ELEMENT {
	public static void main(String[] args) {
		int[] arr = {5,10,25,300,1000};
		
		int max = arr[0];
		
		
		for(int index = 1;index < arr.length;index++) {
			if(arr[index] > max) {
				max=arr[index];
			}
		}		
		System.out.println("MAX : "+max);
		
		
		int min = arr[arr.length-1]; // 100
		for(int i = arr.length-2;i >= 0;i--) {
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Min : "+min);
	}

}
