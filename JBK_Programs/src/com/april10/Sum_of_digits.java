package com.tka;

public class Sum_of_digits {

	public static void main(String[] args) {

		int num = 12345;
		int originalNum = num;
		int sum = 0;
		
		while(num>0) {
			int rem = num%10;
			sum = sum+rem;
			num = num / 10;
		}
		System.out.println("Sum of "+originalNum+" is : "+sum);
	}

}
