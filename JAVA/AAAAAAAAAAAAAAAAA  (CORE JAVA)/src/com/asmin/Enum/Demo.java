package com.asmin.Enum;

enum APPLE{
	A(500),B(300),C(100);
	private int price;
	APPLE(int price){
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
}
public class Demo {
	public static void main(String[] args) {
		System.out.println("A grade APPLE   : "+APPLE.A.getPrice());
		System.out.println("B grade APPLE   : "+APPLE.B.getPrice());
		System.out.println("C grade APPLE   : "+APPLE.C.getPrice());


	}

}
