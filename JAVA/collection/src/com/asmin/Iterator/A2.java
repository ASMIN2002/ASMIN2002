package com.asmin.Iterator;

import java.util.Enumeration;
import java.util.Vector;

public class A2 {

	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		System.out.println(vector);
		System.out.println();
		Enumeration enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}

}
