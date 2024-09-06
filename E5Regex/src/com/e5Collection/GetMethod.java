package com.e5Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetMethod {
	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.addAll(0,Arrays.asList(10,true,null,30,10.0,"Ramu"));
		System.out.println(ls);
	}
}
