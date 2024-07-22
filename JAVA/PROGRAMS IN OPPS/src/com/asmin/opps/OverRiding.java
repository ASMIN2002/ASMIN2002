package com.asmin.opps;
class Mt3{
	int m1() {
		System.out.println("HIII");
		new Mt3().m2(10,"Java is great");
		return 10 * 0;
	}
    
	int m2(int i , String s) {
		new Mt3().m3();
		return 10;
	}
    void m3() {
    	int i = 10;
		System.out.println("end");
	} 
}

public class OverRiding {
	public static void main(String[] args) {
		Mt3 mt = new Mt3();
		System.out.println(mt.m1());
		
	}
}

// HIII,10,java is great,10,end,hii,0
// HIII,end,0 