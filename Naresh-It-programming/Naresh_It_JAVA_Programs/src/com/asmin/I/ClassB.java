package com.asmin.I;

public class ClassB {

	int a = 10;
	public String testMethod1() { // is
		new ClassB(100,200,"JAVA");
		System.out.println(40);
		return new ClassB().testMethod3(new ClassB(50).testMethod2()) + new ClassB().testMethod4("Hi"); //is +  good
	}
	ClassB(){
		System.out.println("Hi");
	}
	public int testMethod2() {  // 25
		System.out.println(50);
		return 10+15;
	}
	ClassB(int a){ // 50
		System.out.println("JAVA IS OSM");
	}
	public String testMethod3(int a) { // 25 // is
		System.out.println(10);
		return "is";
	}
	ClassB(int a,int b,String s){  // 100,200,JAVA
		System.out.println(a+b); // 300
		System.out.println(s); // JAVA
	}
	
	public String testMethod4(String s) { // hii
		System.out.println(88);
		return "good";
		
	}
	public static void main(String[] args) {
		ClassB t1 = new ClassB();
		t1.a = 10;
		ClassB t2 = new ClassB(50);
		t2.a = 30;
		System.out.println("JAVA"+t1.testMethod1()+" " +(t1.a + t2.a-30));

	}

}

// Hi
// java is osm
// 300
// JAVA
// 40
// hi
// java is osm
// 50
// 10
// hi
// 88
// javaisgood 10

















