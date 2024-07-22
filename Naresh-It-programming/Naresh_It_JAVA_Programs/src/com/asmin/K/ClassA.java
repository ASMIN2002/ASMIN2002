package com.asmin.K;

public class ClassA {
	int meth1() { // 38
		int a = 10;
		a++; // 10 = 11
		System.out.println(a++); // 11 = 12 // 2=11
		a++;// 12=13
		System.out.println(++a); // 3=14
		System.out.println(a++); // 4=14
		System.out.println(a++); // 5=15
		a--; // 16=15
		System.out.println(--a); // 6=14
		a=a++ +3;// 17
		System.out.println("a value  = "+a); // 7 : a value = 17
		System.out.println(a++); // 8=17
		--a; // 17
		System.out.println(--a); // 9 = 16
		System.out.println(a--); // 10 = 16
		a = a-- +3; // 15+3 = 18
		return a++ + ++a; // 18+20=38
	}
	
	void meth2() {
		int a = 10; 
		int x = new ClassA().meth1() + a++; // 38 + 10= 48
		System.out.println(x++ + a++); // 48+11 // 11=59
		System.out.println(a++);// 12= 12
		System.out.println(a); // 13= 13
		System.out.println(x); // 14=49
	}
	public static void main(String[] args) 
	{
		System.out.println("START"); // 1-start
		new ClassA().meth2();
		System.out.println("JAVA IS OSM");// 15 = java is osm

	}
}
// START
// 11
// 14
// 14
// 15
// 14
// a value = 17
// 17
// 16
// 16
// 59
// 12
// 13
// 49
// JAVA IS OSM







