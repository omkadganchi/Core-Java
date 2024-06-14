package com.april12;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon u1 = new SBI();
		try {
			u1.paynow();
		} catch (ArithmeticException e) {
			System.out.println("Server issue at bank side");
		}
	}

}
