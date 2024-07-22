package com.asmin.Map;

import java.util.HashMap;
import java.util.Map;

public class H {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("A", "AAA");
		map.put("B", "BBB");
		map.put("C", "CCC");
		map.put("D", "DDD");
		System.out.println(map);
		map.put("D","EEE");
		System.out.println(map); // duplicates are not allow in key values
		map.put("E", "EEE");
		map.put("F", "FFF");
		System.out.println(map); // duplicates are allowing in values 
		map.put(null, "AAA");
		map.put(null, "BBB");	// only one null element is allowing in key values
		System.out.println(map);
		map.put("X", null);
		map.put("Y", null);		// any number of null element are allowing in values
		System.out.println(map);
		map.put(10,100);		// allowing heterogeneous element
		System.out.println(map);

	}

}
