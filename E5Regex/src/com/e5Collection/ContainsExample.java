package com.e5Collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

public class ContainsExample {

	public static void main(String[] args) {
		Collection c = Arrays.asList(10,20,30,40);
		System.out.println(c.contains(10));
		System.out.println(c.contains(null));
		System.out.println(c.contains(50));
		
		TreeSet t = new TreeSet(c);
		System.out.println(t.contains(10));
		System.out.println(t.contains(null));
	}

}
