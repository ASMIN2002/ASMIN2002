package com.asmin.methods;

class Test1{
	public Test1() {
	 System.out.println("Test-Con");
	 new Test1(600);
	}
	public Test1(int i) {
		i++;
		System.out.println(i);
		
	}
	public int m1(int i) {
		System.out.println(i);
		m2("CHINU");
		return 30;
	}
	public String m2(String u) {
		System.out.println(u);
		System.out.println("String Fun");
		return m4("COOL");
	}
	public String m4(String f) {
		System.out.println(f);
		m5();
		return "ASMIN";
	}
	public void m5() {
		new Test1(999);
		new Test1(800);
	}
	public int m3(int i,int j) {
		System.out.println(i+j);
		System.out.println(i*j);
		System.out.println(i-j);
		m1(50);
		return 20;
	}
	public String toString() {
	System.out.println("Chuaa Bhai");
		return "Banglore";
	}
}
public class Method7{
	public static void main(String[] args) {
		System.out.println("Start");
		Test1 t = new Test1();
		t.m3(50,20);
		System.out.println(t);
		System.out.println("Bye");
	}

}