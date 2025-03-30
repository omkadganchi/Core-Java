package com.tka;

public class frquency_of_char_in_String {

	public static void main(String[] args) {

		String s = "Billionair Balasaheb Kadganchi";
		
		s = s.toLowerCase();
		
		char ch = 'b';
		int count = 0;
		
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)==ch) {
				count ++;
			}
		}
		System.out.println("Total count of b in string is: "+count);
	}

}
