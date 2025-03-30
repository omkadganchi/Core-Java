package com.tka;

public class Prime_num {

	public static void main(String[] args) {
		
		
		
	                     //LOGIC NO 1
		
		
		int count;
		
		for(int i=2; i<=100; i++) {
			 count =0;
		
			 for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.print(i+" ");
			}
		}
		
		
		
		
		
		
		
		                  //LOGIC NO 2
		
		
//		int num = 47;
//		int count = 0;
//		
//		for(int i=1; i<=num; i++) {
//			if(num%i==0) {
//				count++;
//			}
//		}
//		if(count==2) {
//			System.out.println(num+" is prime number");
//		} else {
//			System.out.println(num+" is not prime number");
//		}
	}
}
