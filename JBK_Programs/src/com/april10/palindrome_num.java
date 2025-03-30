package com.tka;

public class palindrome_num {

	public static void main(String[] args) {

		int num = 12421;
		int originalNum = num;
		int sum = 0;

		while (num > 0) {
			int rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (originalNum == sum) {
			System.out.println(originalNum + " is a palindrome number");
		} else {
			System.out.println(originalNum + " is not a palindrome number");
		}
	}

}