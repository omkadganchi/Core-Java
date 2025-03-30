package com.tka;

import java.util.Scanner;

public class Determine_zero_positive_negative_val {

	public static void main(String[] args) {

		
		             //LOGIC NO 1
			
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter the number : ");
//				
//		try {
//			int num = scanner.nextInt();
//			
//			if(num>0)
//				System.out.println(num+" is positive number");
//			else if(num<0)
//				System.out.println(num+" is negative number");
//			else
//				System.out.println(num+" is neither positive nor negative");
//		} catch (Exception e) {
//			System.err.println("Enter the Integer values only");
//		}
		
		
		
		                    
		
		
		                  //LOGIC NO 2
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number : ");
		String input = scanner.next();
		
		try {
			int num = Integer.parseInt(input);
			System.out.println(num+(num>0 ? " is positive number": num<0 ? " is negative number": " is neither positive nor negative"));
		} catch (Exception e) {
			try {
				float num = Float.parseFloat(input);
				System.out.println(num+(num>0 ? " is positive number": num<0 ? " is negative number": " is neither positive nor negative"));
			} catch (NumberFormatException e2) {
				try {
					double num = Double.parseDouble(input);
					System.out.println(num+(num>0 ? " is positive number": num<0 ? " is negative number": " is neither positive nor negative"));
				} catch (NumberFormatException e3) {
					System.out.println("Please enter a valid number (integer or float or double)");
				}
			}
		} finally {
			scanner.close();
		}
	}

}
