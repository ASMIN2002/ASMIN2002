package com.asmin.inheritance;

class One{
	public void print_greek() {
		System.out.print("Greeks");
	}
}

class Two extends One{
	public void print_for() {
		System.out.print("for");
	}
}
public class I3 {
	public static void main(String[] args) {
		Two g = new Two();
		g.print_greek();
		g.print_for();
		g.print_greek();
	}

}