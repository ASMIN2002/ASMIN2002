package com.asmin.methods;

class Chinu{
	public Chinu() {
		m4();
	}
	public int m1(int i) {
		System.out.println("M1-method");
		return 10;
	}
	public int m2() {
		m1(20);
		System.out.println("M2-method");
		System.out.println(m1(30));
		return 30;
	}
	public String m3(String s){ 
		System.out.println(s);
		m2();
		return "Chuaa bhai";
	}
	public void m4() {
		m3("tiku");
		System.out.println("M4-method");
		m1(50);
	}
}
public class Method4 {
	public static void main(String[] args){
		System.out.println("hii");
		Chinu c = new Chinu();
		System.out.println("Bye");
		c.m4();
		System.out.println(c.m2());	
	}
}