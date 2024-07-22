package com.asmin.opps;

class Su{
	Su(){
		System.out.println("Su-CON-0-ARG");
	}
	Su(int i){
		System.out.println("SU-CON-PARAM");
	}
}
class Pe extends Su{
	Pe(){
		super(10);
		System.out.println("Pe-con");
	}
}
public class SUPPER_KEYWORD_CONSTRUCTOR {
	public static void main(String[] args) {
		Pe p = new Pe();
	}

}
