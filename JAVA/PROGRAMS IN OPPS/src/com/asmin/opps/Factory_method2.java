package com.asmin.opps;

class Fact{
	private Fact() {
		
	}
	void m1() {
		System.out.println("M1=A");
	}
	static Fact getObject() {
		Fact f = new Fact();
		return f;
	}
}
public class Factory_method2 {
	public static void main(String[] args) {
		Fact f = Fact.getObject();
		f.m1();
	}

}
