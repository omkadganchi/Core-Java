package com.march18;

public class Calculator {
	private double num1;
	
	Calculator(double n){
		num1 = n;
	}
	
	double add(double a) {
		return num1 + a;
	}
	
	double add(double a, double b) {
		return b + a;
	}
	
	String add(String a, double b) {
		return a + b;
	}
	
	String add(String s1, String s2) {
		return s1 + s2;
	}
}
