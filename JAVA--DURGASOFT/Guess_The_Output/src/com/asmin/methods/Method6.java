package com.asmin.methods;

class Babu{
	public Babu() {
		System.out.println("B-con");
		
	}
	public Babu(int j,int k) {
		System.out.println("B-param-con");
		m3(30);
	}
	public void m1(int i) {
		System.out.println(i);
		new Babu();
	}
	public int m2(int k) {
		System.out.println(k);
		System.out.println("M2-method");
		m1(50);
		for(int z=0;z<1;z++) {
			System.out.println("raja");
		}
		return k;
	}
	public int m3(float k) {
		System.out.println(k);
		m2(80);
		System.out.println("m3-Method");
		return 40;
	}
}
class B extends Babu{
	public B() {
		super(20,30);
		System.out.println("con-b");
		
	}
	public B(int k) {
		System.out.println("Start");
		System.out.println(k);
		new B();
	}
}
public class Method6 {
	public static void main(String[] args) {
		B b = new B(90+80);
		System.out.println("Thank You");
	}
}