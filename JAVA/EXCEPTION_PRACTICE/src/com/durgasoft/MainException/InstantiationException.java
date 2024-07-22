package com.durgasoft.MainException;

class Student{
	public Student(String name) {}
	}
public class InstantiationException {
	public static void main(String[] args)throws Exception {
		Class cls = Class.forName("com.durgasoft.MainException.InstantiationException");
		Object obj = cls.newInstance();
		
	}

}
