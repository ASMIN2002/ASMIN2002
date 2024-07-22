package com.durgasoft.MainException;

public class ClassNotFoundException {

	public static void main(String[] args)throws Exception {
		//Class.forName("com.durgasoft.MainException.ClassNotFoundException");  == valid
		//System.out.println("DONE");
		Class.forName("com.durgasoft.MainException."); // == invalid(ClassNotFoundException)
	}
}
