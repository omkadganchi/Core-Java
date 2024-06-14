package com.march18;

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(10);
		
		System.out.println(c1.add(20.12));
		System.out.println(c1.add(15.5, 1540.5));
		System.out.println(c1.add("Om ", 45.30));
		System.out.println(c1.add("Om", " Kadganchi"));
	}

}
