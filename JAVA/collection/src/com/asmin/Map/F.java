package com.asmin.Map;

import java.text.Collator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class F {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("A", "AAA");
		map.put("B", "BBB");
		map.put("C", "CCC");
		map.put("D", "DDD");
		System.out.println(map);
		Set set = map.keySet();
		System.out.println(set);
		Collection collection = map.values();
		System.out.println(collection);

	}

}
