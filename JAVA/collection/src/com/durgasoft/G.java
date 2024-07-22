package com.durgasoft;

import java.util.ArrayList;
import java.util.Collection;

public class G {

	public static void main(String[] args) {
		Collection collection1 = new ArrayList();
		collection1.add("AAA");
		collection1.add("BBB");
		collection1.add("CCC");
		System.out.println(collection1);
		
		Collection collection2 = new ArrayList();
		collection2.add("AAA");
		collection2.add("BBB");
		collection2.add("CCC");
		collection2.add("DDD");
		collection2.add("EEE");
		collection2.add("FFF");
		System.out.println(collection2);
		
		
		
		Collection collection3= new ArrayList();
		collection3.add("AAA");
		collection3.add("BBB");
		collection3.add("XXX");
		collection3.add("YYY");
		System.out.println(collection3);
		
		System.out.println(collection2.retainAll(collection1)); //true
		System.out.println(collection2);
		
		System.out.println(collection2.retainAll(collection1)); // false
		System.out.println(collection2);
		
		System.out.println(collection2.retainAll(collection3));// true
		System.out.println(collection2);

	}

}
