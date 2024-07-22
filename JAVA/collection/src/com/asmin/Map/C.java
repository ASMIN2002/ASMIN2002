package com.asmin.Map;

import java.util.HashMap;
import java.util.Map;

public class C {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("A", "AAA");
		map.put("B", "BBB");
		map.put("C", "CCC");
		map.put("D", "DDD");
		System.out.println(map);
		System.out.println(map.get("B"));
		System.out.println(map.get("C"));

	}

}
