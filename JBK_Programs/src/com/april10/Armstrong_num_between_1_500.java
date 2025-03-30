package com.tka;

public class Armstrong_num_between_1_500 {

	public static void main(String[] args) {

		for (int i = 1; i <= 500; i++) {
			int num = i;
			int sum = 0;
			int powDigit = String.valueOf(num).length();

			while (num > 0) {
				int rem = num % 10;
				sum += Math.pow(rem, powDigit);
				num = num / 10;
			}
			if (i == sum) {
				System.out.print(i + " ");
			}
		}
	}
}