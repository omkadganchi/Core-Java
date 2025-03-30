package com.tka;

public class Find_max_num {
	public static void main(String[] args) {
		
		int num1 = 100;
		int num2=20;
		int num3=67;
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is greater number");
		} else if(num2>num1 && num2>num3) {
			System.out.println(num2+" is greater number");
		} else if(num3>num1 && num3>num2) {
			System.out.println(num3+" is greater number");
		} else {
			System.out.println("all numbers are equal");
		}
	}

}
