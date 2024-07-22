package com.durgasoft.LIST;

import java.util.ArrayList;
import java.util.List;

public class ListB {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(0,"AAA");
		list.add(1,"BBB");
		list.add(2,"CCC");
		list.add(3,"DDD");
		System.out.println(list);
		
		list.add(1,"XXX");
		System.out.println(list); 
		
		list.add(8,"ZZZ");
		System.out.println(list);
	}

}
