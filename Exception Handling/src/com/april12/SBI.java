package com.april12;

public class SBI extends Amazon {

	@Override
	public void paynow() throws ArithmeticException {
		System.out.println("SBI paynow method");
		System.out.println(10 / 0);
	}
}
