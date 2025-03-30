package com.tka;

public class Armstrong_num {

	public static void main(String[] args) {

		int num = 371;
		int originalNum = num;
		int sum = 0;
		int powDigit = String.valueOf(originalNum).length();

		while (num > 0) {
			int digit = num % 10;
			sum = sum + (int) Math.pow(digit, powDigit);
			num = num / 10;
		}
		
		if (originalNum == sum) {
			System.out.println(originalNum + " is armstrong number");
		} else {
			System.out.println(originalNum + " is not armstrong number");
		}
	}
}