package com.e5.Collection;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		for(int i=1; i<=10; i++)
			set.add(i*10);
		
		System.out.println(set);
		
//		System.out.println(set.tailSet(40));
//		System.out.println(set.headSet(40));
//		System.out.println(set.ceiling(31)); // Nearest higher
//		System.out.println(set.floor(31)); // Nearest lower
		
//		System.out.println(set.higher(100)); // null
//		System.out.println(set.lower(1)); // null
//		System.out.println(set.first());
//		System.out.println(set.last());
//		System.out.println(set.pollFirst());
//		System.out.println(set.pollLast());
		
//		System.out.println(set.subSet(10, true, 50, true));
//		System.out.println(set.headSet(10, true));
		
//		
//		Demo2 o = new Demo();
//		Demo obj = (Demo)o;
//		System.out.println(o);
	}

}
