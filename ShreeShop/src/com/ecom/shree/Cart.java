package com.ecom.shree;

import java.util.ArrayList;

public class Cart {
	ArrayList<String> list = new ArrayList<>();
	static double totalBill;
	public void viewCart() {
		System.out.println("\n*******Cart Module *******");
		for(String prod:list) {
			String[] arr= prod.split(" ");
			System.out.println(prod);
//			totalBill += arr[2];
		}
	}
	

}
