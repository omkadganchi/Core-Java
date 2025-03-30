package com.tka;

public class RemoveCharFromArray {

	public static void main(String[] args) {

		String s = "Java By Kiran";
		
		String[] r = s.split("a|i");

		String res = "";
		for (String a : r) {
			res = res + a;
		}
		System.out.println(res);
	}

}
