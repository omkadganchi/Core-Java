package com.april4;

import java.util.Arrays;

public class QA {
	public static void main(String[] args) {

//		String[] name = { "JAY", "VIRU", "KIRAN", "BASANTI", "RAHUL", "VIJAY", "PAVAN" };
//		int count = 0;
//
//		for (String n : name) {
//			if (n.startsWith("V")) {
//				count++;
//				System.out.println(n);
//				System.out.println("Total numbers of letters: "+n.length());
//			}
//		}
//		System.out.println("Total count is: " + count);
		
		
		
//		StringBuffer s =new StringBuffer("NITIN");
//		
//		StringBuffer s1 = new StringBuffer(s.reverse());
//		if(s1.toString().equals(s.toString())) {
//			System.out.println("is palindrome");
//		} else {
//			System.out.println("is not a palindrome");
//		}
		
		
		
		
	String s = "REad";
	String s1 = "deAr";
	
	if(s.length() == s1.length()) {
		s=s.toLowerCase();
		s1=s1.toLowerCase();
		
		char[] ns = s.toCharArray();
		char[] ns1 = s1.toCharArray();
		
		Arrays.sort(ns);
		Arrays.sort(ns1);
		
		System.out.println(ns);
		System.out.println(ns1);
		
		
		
	}
	}
}