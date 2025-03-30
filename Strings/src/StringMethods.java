package com.tka;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = "Java By Kiran";
//				String s2 = "java By Kiran";
//				String s3 = "    om     ";
//				int n1 = 30;

		// toString
//				System.out.println(s1.toString());

		// intern
//				System.out.println(s1.intern());

		// equals
//				System.out.println(s1.equals(s2));//false because s2 has 'j' and s1 has 'J'

		// toLowerCase
//				System.out.println(s1.toLowerCase());

		// toUpperCase
//				System.out.println(s1.toUpperCase());

		// subString
//				System.out.println(s1.substring(5,6));//B
//				System.out.println(s1.subSequence(5, 6));//B
//				System.out.println(s1.substring(4));

		// Chars
//		 System.out.println(s1.chars());//s1.chars() gives you a way to look at each
		// character
//		 in s1, one at a time. But System.out.println() doesn’t know how to directly
		// print this
		// information, so it shows you a technical description
		// (java.util.stream.IntPipeline$Head@1b6d3586)
		// of where this information is stored.

		// HashCode
//				System.out.println(s1.hashCode());//The number printed by s1.hashCode() is a unique code that helps 
		// computers quickly compare strings. It’s like a fingerprint for s1 — each
		// string has its own fingerprint.

		// charAt
//				System.out.println(s1.charAt(9));

		// repeat
//				System.out.println(s1.repeat(2));

		// replace
//				System.out.println(s1.replace('J', 'L'));
//				System.out.println(s1.replaceAll(s1, s2));//s1 la s2 ni replace krte 

		// isEmpty
//				System.out.println(s3.isEmpty());

		// isBlank
//				System.out.println(s3.isBlank());//return true, whether string is null or only spaces. returns false if contains any char

		// toCharArray
//				System.out.println(s1.toCharArray());

		// length
//				System.out.println(s1.length());

		// startsWith
//				System.out.println(s1.startsWith("Kiran"));//false

		// endsWith
//				System.out.println(s1.endsWith("Kiran"));//true

		// trim
//				System.out.println(s3.trim());//removes unnecessary spaces

		// contains
//				System.out.println(s1.contains("By"));

		// equalsIgnoreCase
//				System.out.println(s1.equalsIgnoreCase(s2));

		// valueOf
//				String s4 = String.valueOf(n);
//				System.out.println(s4+10);

		// indexOf
//				int index1 = s1.indexOf('B');
//				int index2 = s2.indexOf('n');
//				System.out.println(index1+" "+index2); //5 12
	}
}
