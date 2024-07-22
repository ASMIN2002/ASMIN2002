package com.asmin.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.lang.model.element.Element;

public class C2 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		System.out.println(list);
	
		ListIterator iterator = list.listIterator();
		while(iterator.hasNext()) {
			String element = (String)iterator.next();
			if(element.equals("BBB")) {
				iterator.add("XXX");
			}
			if(element.equals("DDD")) {
				iterator.set("ZZZ");
			}
			if(element.equals("AAA")) {
				iterator.remove();
			}
		}
		System.out.println(list);
		
	}

}
