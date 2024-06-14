package com.march15;

public class Bank {
	private static int balance = 1000;
	private String name;
	private int accno;

	Bank(String n, int acc) {
		name = n;
		accno = acc;
	}

	public static int getBalance() {
		return balance;
	}

	public static void setBalance(int bal, int pin) {
		if (pin == 1234) {
			if (bal > 0)
				Bank.balance += bal;
		} else {
			System.out.println("Invalid Pin");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int acc) {
		accno = acc;
	}

}
