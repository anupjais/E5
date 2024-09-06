package com.e5Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UsernameValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your user name : ");
		String userName = sc.next();
		if(Pattern.matches(("[a-zA-Z0-9]{5,15}"), userName))
		{
			System.out.println(userName+" is a valid user.");
		}else {
			System.out.println(userName+" is not a valid user.");
		}
	}
}
