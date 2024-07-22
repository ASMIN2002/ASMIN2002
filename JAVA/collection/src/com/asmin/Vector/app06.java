package com.asmin.Vector;


 // Various Methods In Vector

import java.util.Vector;

public class app06 {

	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add("AAA");												// add();
		vector.add("DDD");
		vector.add("CCC");
		vector.add("BBB");
		System.out.println(vector.capacity());							// capacity();
		System.out.println(vector);
		System.out.println(vector.firstElement());						// firstElement();
		System.out.println(vector.lastElement());						// lastElement();
		System.out.println(vector.elementAt(2));						// elementAt(int Index);
		System.out.println();
		System.out.println(vector.removeElement("DDD"));				// removeElement(Object Element);
		System.out.println(vector);
		System.out.println(vector.removeElement("DDD"));
		System.out.println(vector);
		vector.removeElementAt(2);										// removeElementAt(int Index);
		System.out.println(vector);
		vector.removeAllElements();										// removeAllElements();
		System.out.println(vector);
		
	}

}
