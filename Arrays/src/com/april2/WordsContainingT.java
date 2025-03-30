package com.april2;

public class WordsContainingT {
	public static void main(String[] args) {
		String[] words = { "Table", "Chair", "Cat", "Telephone", "Dog", "Laptop", "Tiger", "Hat", "Book", "Internet" };

		for (String string : words) {
			if (string.toLowerCase().contains("t")) {
				System.out.println(string);
			}
		}
	}
}
