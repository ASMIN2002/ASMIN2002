package com.asmin.C;

public class Main {
	String meth1(int a,int b) 
	{
		System.out.println(10);
		System.out.println((54+a)-b);
		int value = new Main().meth5(); 
		System.out.println(value);
		return "JAVA";		
	}
	int meth2(int a)
	{
		System.out.println(75);
		int b = 5;
		System.out.println(b-a);
		return (5*5)-b;
	}
	void meth3() {
		System.out.println("START");
		System.out.println(new Main().meth4());
		System.out.println(40);
	}
	String meth4()
	{
		System.out.println("TODAY IS MONDAY");
		return new Main().meth1(4, 8);
	}
	int meth5() 
	{
		Main obj = new Main();
		System.out.println(99);
		return obj.meth2(5);
	}
	public static void main(String[] args) {
		Main obj=new Main();
		obj.meth3();

	}

}

