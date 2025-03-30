package com.tka;

public class ArmstrogNum {

	public static void main(String[] args) {

		int num = 370;
		
		int originalNum = num;
		int sum = 0;
		int digitpow = String.valueOf(num).length();
		
		while(num>0) {
			int digit = num % 10;
			sum += Math.pow(digit, digitpow);
			num = num / 10;
		}
		if(sum == originalNum) {
			System.out.println(originalNum+" is armstrong number");
		} else {
			System.out.println(originalNum+" is not armstrong number");
		}
	}

}
