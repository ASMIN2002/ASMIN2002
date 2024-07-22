package com.asmin.exception;

public class E {
	public static void main(String[] args) {
	Thread t = new Thread();
	System.out.println(t.getPriority());
	t.setPriority(8);
	System.out.println(t.getPriority());
	t.setPriority(16);	                        // IllegalArgumentException (Not in Range in between 1 to 10)
	}

}
