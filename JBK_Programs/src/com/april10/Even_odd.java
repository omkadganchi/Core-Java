package com.tka;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");

		try {

			int num = sc.nextInt();

			if (num % 2 == 0) {
				System.out.println(num + " is even number");
			} else {
				System.out.println(num + " is odd nuber");
			}
		}
		catch (Exception e) {
			System.out.println("Enter the integer value only");
		}
		finally {
			sc.close();
		}
	}
}
