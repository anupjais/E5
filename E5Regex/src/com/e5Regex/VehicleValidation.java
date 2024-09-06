package com.e5Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class VehicleValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Vihicle Number : ");
		String vehNum = sc.nextLine();
		
		if(Pattern.matches(("[A-Z]{2} [0-9]{2} [A-Z]{1,} [0-9]{4}"), vehNum))
		{
			if(!(vehNum.substring(3, 5).equals("00") || vehNum.endsWith("0000")))
				System.out.println(vehNum+" is valid.");
			else {
				System.out.println(vehNum+" is  not valid.");
			}
		}
		else
			System.out.println(vehNum+" is not valid.");
//		System.out.println(vehNum.substring(3, 5).equals("12"));
	}

}
