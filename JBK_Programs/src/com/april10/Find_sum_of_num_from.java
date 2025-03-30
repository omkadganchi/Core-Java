package com.tka;

import java.util.Scanner;

public class Find_sum_of_num_from {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		try {
			System.out.print("Enter the first number: ");
			int num1 = scanner.nextInt();
			System.out.print("Enter the second number: ");
			int num2 = scanner.nextInt();
		for(int i=num1; i<=num2; i++) {
			 sum = sum + i;
		}
		System.out.println("Sum is: "+sum);
	} catch (Exception e) {
		 System.out.println("Please enter valid integers.");
	} finally {
		scanner.close();
	}
	}
}


  