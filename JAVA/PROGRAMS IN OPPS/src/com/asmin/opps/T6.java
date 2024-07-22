package com.asmin.opps;

class TT6{
	static {
		System.out.println("class Loading ... ");
	}
	TT6(){
		System.out.println("Object Creating ... ");
	}
}
public class T6 {
	public static void main(String[] args) {
		TT6 t = new TT6();

	}

}
