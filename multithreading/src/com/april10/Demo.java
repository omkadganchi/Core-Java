package com.april10;

public class Demo {
	static int balance = 500;

	synchronized public static void paynow(int amt) {
		if (balance > amt) {
			balance = balance - amt;
			System.out.println(balance);
		} else {
			System.out.println("inssuficient balance");
		}
		for(int i =0; i<8; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
