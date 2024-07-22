package com.asmin.inheritance;

class One1{
	public void print_greek() {
		System.out.print("Greeks");
	}
}
class Two2 extends One1{
	public void print_for() {
		System.out.print("for");
	}
}
class Three3 extends Two2{
	public void print_lastGreek() {
		System.out.print("Greek");
	}
}
public class I4 {
	public static void main(String[] args) {
		Three3 t = new Three3();
		t.print_greek();
		t.print_for();
		t.print_lastGreek();

	}

}
