package com.e5Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class AddAllExample {
	public static void main(String[] args) {
		
		Collection col = new TreeSet();
		Collection col1 = new ArrayList();
		for(int i=0; i<10; i+=2)
			col1.add(i);
		System.out.println("Col2 : "+col1);
		
		System.out.println("Col1 before : "+col);
		col.addAll(col1);
		System.out.println("Col1 after : "+col);
		
		col1.addAll(col1);
		System.out.println(col1);
//		System.out.println(col.addAll(col1)); // It's false
	}
}
