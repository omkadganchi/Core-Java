package com.tka;

public class Fibonacci_series {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c;
		int num = 10;
		
		System.out.print(a+" "+b);
		
		for(int i=2; i<num; i++) {
			c = a+b;
			
			System.out.print(" "+c);
			
			a = b;
			b = c;
		}
	}

}
