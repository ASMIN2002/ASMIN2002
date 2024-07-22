package com.asmin.Map;

import java.util.HashMap;
import java.util.Map;

public class G {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("A", "AAA");
		map.put("B", "BBB");
		map.put("C", "CCC");
		map.put("D", "DDD");
		System.out.println(map);
		System.out.println(map.containsKey("B"));
		System.out.println(map.containsKey("X"));
		System.out.println(map.containsValue("BBB"));
		System.out.println(map.containsValue("XXX"));

	}

}
