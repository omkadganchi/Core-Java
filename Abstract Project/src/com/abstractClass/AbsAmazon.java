package com.abstractClass;

public abstract class AbsAmazon implements AmazonI{
	AbsAmazon(){
		System.out.println("Abstract class contructor is running...");
	}
	void m3() {
		System.out.println(333);
	}
	
	@Override
	public boolean paynow(Object obj, int amt) {
		if(amt == 200) {
			return true;
		} else {
			return false;
		}
	}
	
	abstract void m1();
	abstract void m2();
}
