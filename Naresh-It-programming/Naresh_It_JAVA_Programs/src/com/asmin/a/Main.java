package com.asmin.a;



public class Main {
	int meth1(int a,int b) // 200,199
	{
		System.out.println(a);   // 1 - 200
		System.out.println(a-b); // 2 - 1
		return new Main().meth4(a-1,"HII");
	}
	String meth2(int x) // 500
	{
		System.out.println(x-new Main().meth1(200,199));//500- 398 = 5-102
		System.out.println(x); // 6 - 500
		return "java";
	}
	String meth3(int a,int b,String s)// 15,25,java
	{
		System.out.println(a);   // 7 - 15
		System.out.println(a+a); // 8-30
		System.out.println(a+b); // 9-40
		return s;
	}
	int meth4(int a,String s)   //199,hii
	{
		System.out.println(a);  //3-199
		System.out.println(s);  //4-hii
		return a+a; //398
	}
	String meth5(String s)     //java
	{
		return s;              //10-java
	}
	public static void main(String[] args) {
		System.out.println(new Main().meth5(new Main().meth3(15, 25,  new Main().meth2(500))));

	}

}
