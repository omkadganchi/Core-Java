package com.april2;

public class Perfect_num {

	public static void main(String[] args) {

		int num = 28;
		int sum = 0;
		
		for(int i=1; i<=num/2; i++) {
			if(num%i == 0) {
				sum += i;
			}
		}
		if(num == sum) {
			System.out.println(num+" is perfect number");
		} else {
			System.out.println(num+" is not perfect number");
		}
		
		
		
		

		
		                //to find between numbers
		
//		int num = 0; 
//		int sum = 0;  
//		
//		for (int i = 1; i < 10000; i++) {
//			num = i;
//			sum = 0;
//			for (int j = 1; j <= num / 2; j++) {
//				if (num % j == 0) {
//					sum += j;
//				}
//			}
//			
//			if(sum==num) {
//				System.out.println(num);
//			}
//		}

	}
}
