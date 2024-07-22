package com.asmin.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		System.out.println(list);
		System.out.println();
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
