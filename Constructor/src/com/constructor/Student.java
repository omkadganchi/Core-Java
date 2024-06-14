package com.constructor;

public class Student {
	String name;
	int rollNo;
	long prnNo;
	String stream;

	Student(String n, int r, long p, String s) {
		name = n;
		rollNo = r;
		prnNo = p;
		stream = s;
	}

	public void m1() {
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollNo);
		System.out.println("PRN No: " + prnNo);
		System.out.println("Stram: " + stream);

	}
	
	public void m2(String NAME, long PRNNO) {
		NAME = name;
		PRNNO = prnNo;
		
	}
}
