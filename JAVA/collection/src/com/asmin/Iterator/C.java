package com.asmin.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		System.out.println(list);
		System.out.println();
		ListIterator iterator = list.listIterator();
		System.out.println("Elements In forward Direction");
		while(iterator.hasNext()) {
			System.out.println(iterator.nextIndex()+"=====> "+iterator.next());
		}
		System.out.println();
		System.out.println("Elements in Backward Direction");
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previousIndex()+"=====> "+iterator.previous());
		}
		
	}

}
