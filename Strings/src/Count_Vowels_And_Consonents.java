package com.tka;

public class Count_Vowels_And_Consonents {

	public static void main(String[] args) {

		String s = "The Kiran Academy";
		
		int vowelsCount = 0;
		int consonentCount = 0;
		int spacesCount = 0;
		
		s = s.toLowerCase();
		
		
		for(int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if (ch >='a' && ch<='z' || ch==' ') {
				
				if(ch == 'a'|| ch == 'e'|| ch == 'i'| ch == 'o'|| ch=='u') {
					vowelsCount++;
				} else if(ch ==' ') {
					spacesCount++;
				} else {
					consonentCount++;
				}
			}
		}
		System.out.println("Total number of Vowels are: "+vowelsCount);
		System.out.println("Total number of Consonents are: "+consonentCount);
		System.out.println("Total number of Spaces are: "+spacesCount);
	}

}
