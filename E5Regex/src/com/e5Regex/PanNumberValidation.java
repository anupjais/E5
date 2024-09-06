package com.e5Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PanNumberValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Your Pan numbere : ");
		String pan = sc.next();
		if(Pattern.matches(("[A-Z]{5}[0-9]{4}[A-z]{1}"), pan))
			if(!pan.substring(5,9).equals("0000"))
				System.out.println(pan+" is valid");
			else
				System.out.println(pan+" is not valid");
//		System.out.println(pan+" is not valid");
	}

}
