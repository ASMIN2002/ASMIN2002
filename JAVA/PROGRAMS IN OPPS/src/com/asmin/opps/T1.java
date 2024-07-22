package com.asmin.opps;

// about static variable

class Tiku1{
	static int i = 10;
	void m1() {
		//  static int i = 20;  == static variable not possible in local variable
		System.out.println(this.i);  // but we can access this by using this keyword
	}
}
public class T1 {
	public static void main(String[] args) {
		Tiku1 t = new Tiku1();
		System.out.println(t.i);
		System.out.println(Tiku1.i);

	}

}
