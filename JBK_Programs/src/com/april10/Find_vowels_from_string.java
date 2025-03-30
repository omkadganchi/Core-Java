package com.tka;

public class Find_vowels_from_string {

	public static void main(String[] args) {

		String s ="Software";
		char[] ch = s.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' || 
			   ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				System.out.print(ch[i]+" ");
				
			}
		}
	}

}
