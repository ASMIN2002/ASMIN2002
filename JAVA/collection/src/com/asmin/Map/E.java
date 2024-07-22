package com.asmin.Map;

import java.util.HashMap;
import java.util.Map;

public class E {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("A", "AAA");
		map.put("B", "BBB");
		map.put("C", "CCC");
		map.put("D", "DDD");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		map.clear();
		System.out.println(map.isEmpty());

	}

}
