package com.march18;

public class TestLoginCheck {

	public static void main(String[] args) {
	
		LoginCheck l1 = new LoginCheck("Om Kadganchi",7620905569L);
		
		System.out.println(l1.login(7620905569L));
		System.out.println(l1.login("Om Kadganchi"));
	}

}
