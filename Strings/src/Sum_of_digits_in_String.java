package com.tka;

public class Sum_of_digits_in_String {

	public static void main(String[] args) {

	               	// calculate each character's sum

		
//		String s = "nik4hil9 Lo12h5ar9";
//		
//		int sum = 0;
//		
//		for(int i =0; i<s.length(); i++) {
//			if(Character.isDigit(s.charAt(i))) {
//				sum += Character.getNumericValue(s.charAt(i));
//			}
//		}
//		System.out.println("Sum is: "+sum);

		
		
		
		
		                // calaculate sum by numbers

		
		String s = "nik4hil9 Lo12h5ar9";
	
		int sum = 0;
		int currectsum = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				currectsum = currectsum * 10 + (s.charAt(i)-'0');
			} else {
				sum = sum + currectsum;
				currectsum = 0;
			}
		}
		sum = sum + currectsum;
		System.out.println("Sum is: "+sum);
	}
}