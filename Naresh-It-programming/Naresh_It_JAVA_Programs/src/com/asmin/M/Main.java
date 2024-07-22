package com.asmin.M;

public class Main
{
	int c;
	static int e;
	
	Main()
	{
		System.out.println(++c);
		System.out.println(++e);
	}
	public static void main(String[] args) 
	{
		int a = 34;
		int b = 21;
		new Main().c-=a++ + ++b; // 34+22=56
		int d= --a + --b + new Main().c--; // 34+21+56 
		e=a + +b +new Main().c + d--; 
		int f=-a + b-- + -new Main().c - d++;
		int sum = a+ b + new Main().c + d + e + f;
		System.out.println("Sum : " +sum);
	}
}

// 1
// 1
// 
