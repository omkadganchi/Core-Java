package com.tka;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String a = "Sole";
		String b = "Lose";
		
		if(a.length()==b.length()) {
			String c = a.toLowerCase();
			String d = b.toLowerCase();
			
			char[] ch = c.toCharArray();
			char[] ch1 = d.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			Boolean result = Arrays.equals(ch, ch1);
			if(result) {
				System.out.println(a+" & "+b+" are anagram");
			} else {
				System.out.println(a+" & "+b+" are not anagram");
			}
		}	
	}
}
