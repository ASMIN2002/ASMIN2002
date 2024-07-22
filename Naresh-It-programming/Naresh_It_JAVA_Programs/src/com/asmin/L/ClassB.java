package com.asmin.L;

public class ClassB 
{
	void meth1() {
		int x = 10;
		System.out.println("Before X : "+x);// 10
		x = x++; // 10 
		System.out.println("After X : "+x+"\n"); // 10
		int y = 20;
		System.out.println(y); // 20
		
		int z = y++; // 21  
		System.out.println("After Y   : "+y); // 21
		System.out.println("Z value   : "+z); // 20
		
		int i = 50;
		System.out.println("Before  i : "+i);// 50
		i = i++ + ++i; // 50+52=102
		System.out.println("After i : "+i);// 102
		int k = 100;
		System.out.println(k);// 100
		k=k++ + 10; // 110
		System.out.println("After K : "+k);// 110
		int m = 100;
		System.out.println("Before M : "+m);// 100
		m = ++m + 10;// 111
		System.out.println("After M : "+m);// 111
		System.out.println("SUM  : "+(x+y+z+i+k+m)); // 10+21+20+102+110+111=374
	}
	public static void main(String[] args) {
		new ClassB().meth1();

	}

}

// before x : 10
// After x : 11
//
// 20
// After Y : 21
// z value : 21
// before i : 50
// After i: 102
// 100
// After k : 110
// before m: 100
// After m : 111
// sum : 376







