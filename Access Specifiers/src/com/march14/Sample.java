package com.march14;

public class Sample {
	int roll;
	String name;
	static String cname = "Java By Kiran";

	Sample(int r, String n) {
		roll = r;
		name = n;
	}

	static void m1() {
		System.out.println("We can directly call static var from static method");
		System.out.println(cname);
		System.out.println("To call non-static var from static method we need to create object");
		Sample s1 = new Sample(15, "Om");
		System.out.println("cname");
		System.out.println(s1.name);
		System.out.println(s1.roll);
	}

	void m2() {
		System.out.println("We can not call static var from non-static method directly, we need to create object");
		System.out.println(cname);
	}
}
