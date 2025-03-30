package com.tka;

public class First_Non_Repeated_Character_in_String {

	public static void main(String[] args) {

		String s = "gibblegabbler";

		System.out.println("Given String is: " + s);

		for (int i = 0; i < s.length(); i++) {
			boolean unique = true;

			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					unique = false;
//					break;
				}
			}
			if (unique) {
				System.out.println("The first non-repeated character in the String is: " + s.charAt(i));
				break;// if we remove this line's break keyword then, it will print all non repeated characters
			}

		}
	}

}
