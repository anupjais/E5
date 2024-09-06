package com.myRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	public static void main(String[] args)
	{
		Pattern pattern = Pattern.compile("bA");
		Matcher matcher = pattern.matcher("AbadkBskAbSBKSAbdsdaBab");
		
		while(matcher.find())
		{
			System.out.println(matcher.start()+"-"+matcher.end()+" -> "+matcher.group());
		}
	}
	
}
