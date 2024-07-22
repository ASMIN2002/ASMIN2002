package com.asmin.opps;

class Factory{
	private Factory(){	
	}
	void m1() {
		System.out.println("M1=F");
	}
	static Factory getInstance() {
		Factory f = new Factory();
		return f;
	}
}

public class Factory_Method {
	public static void main(String[] args) {
		Factory f = Factory.getInstance();
		f.m1();
	}
}
