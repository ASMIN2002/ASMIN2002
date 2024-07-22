package com.asmin.Map;

import java.util.HashMap;
import java.util.Map;

public class B {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("A", "AAA");
		map.put("B", "BBB");
		map.put("C", "CCC");
		map.put("D", "DDD");
		System.out.println(map);
		Map map1 = new HashMap();
		map1.putAll(map);
		System.out.println(map1);
	}

}
