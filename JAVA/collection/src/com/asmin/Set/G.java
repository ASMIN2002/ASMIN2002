package com.asmin.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class G {
	public static void main(String[] args) {
		SortedSet sortedSet = new TreeSet();
		sortedSet.add("DDD");
		sortedSet.add("CCC");
		sortedSet.add("AAA");
		sortedSet.add("FFF");
		sortedSet.add("BBB");
		sortedSet.add("EEE");
		System.out.println(sortedSet);
		System.out.println(sortedSet.headSet("DDD"));            // headSet();  [AAA,BBB,CCC]
		System.out.println(sortedSet.tailSet("DDD"));    		 // tailSet();  [DDD,EEE,FFF]
		System.out.println(sortedSet.subSet("BBB", "EEE"));		 // subSet();   [BBB,CCC,DDD]
		System.out.println(sortedSet.first());					 // first();    AAA
		System.out.println(sortedSet.last());					 // last();     FFF
	}
}
