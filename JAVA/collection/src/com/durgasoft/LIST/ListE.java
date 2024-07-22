package com.durgasoft.LIST;

import java.util.ArrayList;
import java.util.List;

public class ListE {

	public static void main(String[] args) {
	List list = new ArrayList();
	list.add("AAA");
	list.add("BBB");
	list.add("CCC");
	list.add("DDD");
	System.out.println(list);
	System.out.println(list.remove(2));
	System.out.println(list);
	System.out.println(list.remove(6));
	}

}
