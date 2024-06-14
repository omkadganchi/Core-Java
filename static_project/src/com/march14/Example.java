package com.march14;

public class Example {
	int a;
	String s;
	static String cname = "JBK";
	{
		System.out.println("This is normal block 1");
	}

	Example(int a1, String s) {
		System.out.println("This is Constructor");
		a = a1;
	}
	{
		System.out.println("This is normal block 2");
	}

	void m1() {
		System.out.println("This is m1 method");
	}
	static{
		System.out.println("This is static block 1");
	}
	static void m2() {
		System.out.println("This is m2 method");
	}
}