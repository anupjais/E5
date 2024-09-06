package com.e5Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PinCodeValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your pincode : ");
		String pincCode = sc.next();
		if(Pattern.matches(("[09]{6}"), pincCode))
		{
			if(!pincCode.equals("000000"))
				System.out.println(pincCode+" is valid.");
			else
				System.out.println(pincCode+" is not valid.");
		}
		else
			System.out.println(pincCode+" is not valid.");
	}
}
