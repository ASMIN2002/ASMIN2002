package com.durgasoft;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class A{
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("AAA");
		list.add("BBB");
		list.add("AAA");
		System.out.println(list);                //   [AAA,BBB,AAA]
		System.out.println(list.add("AAA"));     //   true 
		System.out.println(list.add("BBB"));     //    true
		System.out.println(list);   
		System.out.println();		
		
		
		  HashSet hashSet = new HashSet();
		  hashSet.add("AAA");
		  hashSet.add("BBB");
		  hashSet.add("AAA"); 
		  System.out.println(hashSet);				// [AAA,BBB]
		  System.out.println(hashSet.add("AAA"));   // false
		  System.out.println(hashSet.add("BBB"));   // false
		 
	}
}
