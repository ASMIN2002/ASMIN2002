package com.asmin.opps;
class AB{
	int i = m1();
	AB(){
		System.out.println("AB=CON");
	}
	{
		System.out.println("Instance Block");
	}
	public int m1() {
		System.out.println("M1=method");
		return 10;
	}
	
}
public class A12 {
	public static void main(String[] args) {
		AB ab = new AB();
	}

}
