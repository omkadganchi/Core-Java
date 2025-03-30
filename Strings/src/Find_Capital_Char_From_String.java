package com.tka;

public class Find_Capital_Char_From_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "AkaNksHa";
		
		char[] ch = s.toCharArray();
		
		for(int i =0; i<ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				System.out.println(ch[i]);
			}
		}
	}

}
