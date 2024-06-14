package com.april11;

import java.util.Scanner;

public class RTO {
	public static void main(String[] args) {

		final int maxAge = 75;
		final int minAge = 17;

		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Age: ");
			int age = sc.nextInt();

			if (age > maxAge) {
				throw new AgeTooHighException("Above 75 age can not apply for driving license");
			} else if (age < minAge) {
				throw new AgeTooSmallException("Below 17 age can not apply for driving license");
			} else {
				System.out.println("Eligible to apply driving license");
			}
		} finally {
			System.out.println("This is RTO website");
		}

//		catch (AgeTooHighException e) {
//			System.out.println(e));
//			// OR
////		System.out.println(e.getMessage());
//		} catch (AgeTooSmallException e) {
//			System.out.println(e);
//		}

	}
}
