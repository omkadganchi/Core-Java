package com.march15;

public class TestCars {

	public static void main(String[] args) {
		
		Cars c1 = new Cars(2014, 6850000);

		c1.setMfgYear(2020);
		System.out.println(Cars.getmName());
		System.out.println(c1.getMfgYear());
		System.out.println(c1.getPrice());

	}
}
