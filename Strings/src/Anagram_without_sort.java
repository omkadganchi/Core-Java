package com.tka;

public class Anagram_without_sort {

	public static void main(String[] args) {

		String s1 = "Race";
		String s2 = "Care";

		if (s1.length() == s2.length()) {

			String s3 = s1.toLowerCase();
			String s4 = s2.toLowerCase();

			int count = 0;
			for (int i = 0; i < s3.length(); i++) {
				for (int j = 0; j < s4.length(); j++) {
					if (s3.charAt(i) == s4.charAt(j)) {
						count++;
					}
				}
			}
			if (count == s3.length()) {
				System.out.println(s1 + " & " + s2 + " are anagram");
			} else {
				System.out.println(s1 + " & " + s2 + " are not anagram");
			}
		} else {
			System.out.println(s1 + " & " + s2 + " are not anagram");
		}

		
		
		
		
		                                  // OR

		
		
		
		
//		String s1 = "Race";
//		String s2 = "Care";
//		
//		s1 = s1.toLowerCase();
//		s2 = s2.toLowerCase();
//		
//		int count = 0;
//		for(int i=0; i<s1.length(); i++) {
//			for(int j=0; j<s1.length(); j++) {
//				if(s1.charAt(i)==s2.charAt(j)) {
//					count++;
//				}
//			}
//		}
//		if(count == s1.length()) {
//			System.out.println(s1+" & "+s2+" are anagram");
//		} else {
//			System.out.println(s1+" & "+s2+" are not anagram");			
//		}
	}

}
