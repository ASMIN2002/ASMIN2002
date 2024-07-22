package com.asmin.Set;

import java.util.HashSet;
import java.util.Set;

public class A {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("AAA");
		set.add("BBB");
		set.add("CCC");
		set.add("DDD");
		set.add("EEE");
		System.out.println(set);
		set.add("AAA");
		set.add("EEE");
		set.add("FFF");
		System.out.println(set);
		set.add(null);
		set.add(null);
		System.out.println(set);
		set.add(10);
		set.add(new StringBuffer("ASMIN"));
		System.out.println(set);

	}

}
