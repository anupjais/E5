package com.e5Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidatioin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your email : ");
		String eml = sc.next();
		
		if(Pattern.matches(("[A-Za-z0-9]@[a-zA-Z].\"com\""), eml))
		{
//			if(!(vehNum.substring(3, 5).equals("00") || vehNum.endsWith("0000")))
				System.out.println(eml+" is valid.");
//			else {
//				System.out.println(vehNum+" is  not valid.");
//			}
		}
		else
			System.out.println(eml+" is not valid.");
//		System.out.println(vehNum.substring(3, 5).equals("12"));
	}

}
