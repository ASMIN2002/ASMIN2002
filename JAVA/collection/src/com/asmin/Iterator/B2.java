package com.asmin.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B2 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		System.out.println(list);
		System.out.println();
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			String element = (String) iterator.next();
			System.out.println(element);
			if(element.equals("CCC")) {
				iterator.remove();
			}
			
		}
		System.out.println();
		System.out.println(list);
	}

}
