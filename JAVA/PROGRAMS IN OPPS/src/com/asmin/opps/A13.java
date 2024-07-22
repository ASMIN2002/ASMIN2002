package com.asmin.opps;

// this keyword 

class ABC{
	int i = 10;
	int j = 20;
	
	ABC(int i , int j){
		System.out.println(i+"   "+j);
		System.out.println(this.i+"   "+this.j);
	}
}
public class A13 {
	public static void main(String[] args) {
		ABC abc = new ABC(30 , 40);
	}
}
