package com.e5Collection;

import java.util.ArrayList;
import java.util.Collection;

public class SizeExample {

	public static void main(String[] args) {
		Collection c = new ArrayList(-1);
//		Collection c = null;
		System.out.println(c.size());
	}

}
