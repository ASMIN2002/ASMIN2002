package com.asmin.JavaFeatures;

import java.util.Comparator;
import java.util.TreeSet;

// NORMAL PROGRAM

//
//class MyComparator implements Comparator<String>{
//	public int compare(String str1,String str2) {
//		return str1.length()-str2.length();
//	}
//}
public class LamdaExp_In_Collections {
	public static void main(String[] args) {
		
		
		//     ANONUMUS INNER CLASS
		
//
//		Comparator<String> comparator = new Comparator<String>() {
//			public int compare(String str1, String str2) {
//				return str1.length() - str2.length();
//			}
//
//		};
		
		
		// LAMDA EXPRESSION
		
		Comparator<String> comparator = (str1,str2) -> str1.length() - str2.length();
		TreeSet treeSet = new TreeSet(comparator);
		treeSet.add("FFF");
		treeSet.add("AAAAAA");
		treeSet.add("EEEE");
		treeSet.add("BBBBB");
		treeSet.add("D");
		treeSet.add("CC");
		System.out.println(treeSet);

	}
}
