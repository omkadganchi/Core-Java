package com.abstractClass;

public class Amazon extends AbsAmazon{

	Amazon(){
		super();
		System.out.println("Child class constructor is running...");
	}

	@Override
	public boolean login(String un, String pwd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean logout(String un, String pwd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int cart(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		
	}

}
