package com.durgasoft.LIST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListC {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("AAA");
		list.add("TTT");
		list.add("CCC");
		list.add("DDD");
		System.out.println(list);
		
		list.set(2, "XXX");
		System.out.println(list);

	}

}
