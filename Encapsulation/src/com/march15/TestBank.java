 package com.march15;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank b1 = new Bank("Jay", 9876);

System.out.println(b1.getName());
b1.setBalance(1500, 1234);
System.out.println(b1.getBalance());

	}

}
