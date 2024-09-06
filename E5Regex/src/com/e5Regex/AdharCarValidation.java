package com.e5Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AdharCarValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your adhar number : ");
		String adharNum = sc.next();
		if(Pattern.matches(("[0-9]{12}"), adharNum))
		{
			if(!(adharNum.equals("000000000000")))
				System.out.println(adharNum+" is valid.");
			else
				System.out.println(adharNum+" is not valid.");
		}
		else {
			System.out.println(adharNum+" is not valid.");
		}
	}

}
