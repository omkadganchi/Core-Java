package com.tka;

public class Question {

	public static void main(String[] args) {

		String[] names = {"Akanksha", "Viren", "Nikhil", "Vishwaraaj", "Om", "Amudi", "Arpita"};
		
		int count = 0;
		for (String a : names) {
			if(a.startsWith("A") || a.startsWith("V")) {
				count++;
				System.out.println("Total letters in "+a+" = "+a.length());
			}
		}
		System.out.println("\nTotal count is: "+count);
	}

}
