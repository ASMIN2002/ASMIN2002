package com.asmin.methods;

class M2{
	public static int i = 1;
	M2(){
		i++;
	}
	public static int get() {
		return i;
	}
	public int m1(){
		System.out.println("Inside the method m1 by object of Method2 class"); // 1
		this.m2();
		return 5;
	}
	public void m2() {
		System.out.println("In Method m2 came from method m1"); // 2
	}
}
public class Method2 {
	public static void main(String[] args) {
		M2 m2 = new M2(); 
		int i = m2.m1();
		
		System.out.println("Control return after method m1 : "+i); // 3: 1
		
		int no_of_Objects = M2.get();
		
		System.out.print("No Of Instances created till Now   : "); // 4  : 1
		System.out.println(no_of_Objects);
	}
}