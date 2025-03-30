package com.tka;

public class Reverse_The_String2 {

	public static void main(String[] args) {

		String s = "Java By Kiran";

//		String[] a = s.split(" ");

		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(s.length() - i - 1));
		}
	}
}
