package com.tka;

public class Palindrome_strings {

	public static void main(String[] args) {
		
		String a = "Madam";
		String s = a.toLowerCase();
		char[] ch = s.toCharArray();
		boolean flag = true;
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i] != ch[s.length()-1-i]) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(a+" is palindrome string");
		} else {
			System.out.println(a+" is not palindrome string");
		}
	}

}
