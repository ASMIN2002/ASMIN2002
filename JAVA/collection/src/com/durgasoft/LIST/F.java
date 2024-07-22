package com.durgasoft.LIST;

import java.util.ArrayList;
import java.util.List;

public class F {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("AAA");
		list.add("BBB");
		list.add("AAA");
		list.add("CCC");
		list.add("DDD");
		list.add("AAA");
		list.add("EEE");
		list.add("AAA");
		System.out.println(list);
		System.out.println(list.indexOf("AAA"));
		System.out.println(list.lastIndexOf("AAA"));
		
		
		
	}

}
