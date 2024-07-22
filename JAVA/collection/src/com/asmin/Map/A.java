package com.asmin.Map;

import java.util.HashMap;
import java.util.Map;

public class A {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("A", "AAA");
		map.put("B", "BBB");
		map.put("C", "CCC");
		map.put("D", "DDD");
		System.out.println(map);
		System.out.println(map.put("E", "EEE"));
		System.out.println(map.put("B", "XXX"));
		System.out.println(map);

	}

}
