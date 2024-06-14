package com.april10;

public class FactorialNumber_recursion {

	int fact(int n) {
		if(n == 1 || n == 0) {
			return 1;
		} else {
			return n * fact(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		FactorialNumber_recursion f1 = new FactorialNumber_recursion();
		System.out.println(f1.fact(4));
	}
}
