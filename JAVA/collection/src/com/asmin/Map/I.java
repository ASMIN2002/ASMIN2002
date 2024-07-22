package com.asmin.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class I {

	public static void main(String[] args) {
		HashMap hashmap = new HashMap();
		hashmap.put("A", "AAA");
		hashmap.put("C", "CCC");
		hashmap.put("B", "BBB");
		hashmap.put("D", "DDD");
		System.out.println(hashmap); // does not folloe insertion order
		
		System.out.println();
		LinkedHashMap linkedHashMap = new LinkedHashMap();
		linkedHashMap.put("A", "AAA");
		linkedHashMap.put("C", "CCC");
		linkedHashMap.put("B", "BBB");
		linkedHashMap.put("D", "DDD");
		System.out.println(linkedHashMap); // follows insertion order

	}

}
