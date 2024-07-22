package com.durgasoft.MainException;

public class IllegalArgumentException {

	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t.getPriority());
		t.setPriority(8);
		System.out.println(t.getPriority());
		t.setPriority(15);
		System.out.println(t.getPriority());
	}

}
