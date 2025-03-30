package com.tka;

public class Reverse_num {

	public static void main(String[] args) {
		
		int num = 356;
		int originalNum = num;
		int sum = 0;
		
		while(num>0) {
			int rem = num%10;
			sum = (sum*10) + rem;
			num = num/10;
		}
		System.out.println("Reverse of "+originalNum+" is: "+sum);
	}

}
