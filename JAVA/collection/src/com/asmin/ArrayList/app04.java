package com.asmin.ArrayList;

import java.util.ArrayList;

public class app04 {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("AAA");
		arrayList.add("CCC");
		arrayList.add("BBB");
		arrayList.add("EEE");
		arrayList.add("DDD");
		System.out.println(arrayList);
		arrayList.add("BBB");
		arrayList.add("CCC");
		System.out.println(arrayList);
		arrayList.add(10);
		arrayList.add(10.03f);
		System.out.println(arrayList);
		arrayList.add(null);
		arrayList.add(null);
		System.out.println(arrayList);
		System.out.println(arrayList.get(2));
		arrayList.add("XXX");
		arrayList.add("HHH");
		System.out.println(arrayList);
		
	}
}
