package com.e5Collection;

import java.util.Collection;
import java.util.TreeSet;

public class RemoveExample {
	public static void main(String[] args) {
		Collection<Integer> c = new TreeSet<Integer>();
		for(int i=10; i<=100; i+=10)
			c.add(i);
		System.out.println(c);
//		c.remove("10");
//		c.remove(null);
		c.remove(200);
		System.out.println(c);
	}
}
