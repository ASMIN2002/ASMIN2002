package com.asmin.Iterator;

import java.util.Enumeration;
import java.util.Vector;

public class A1{

	public static void main(String[] args) {
	Vector vector = new Vector();
	vector.add("AAA");
	vector.add("BBB");
	vector.add("CCC");
	vector.add("DDD");
	System.out.println(vector);
	Enumeration enumeration = vector.elements();
	while(enumeration.hasMoreElements()) {
		System.out.println(enumeration.nextElement());
	}
	}

}
