package com.march26;

public class Student {
    static int a = 90;  //we can access static as well as instance variable using THIS 
	int roll;
	int marks;
	String name;
	
	Student(int roll, String name, int marks){
		System.out.println("We are inside constructor");
		System.out.println(this);
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		
	}
	
	void m1() {
		System.out.println("We are inside M1 method");
		System.out.println(this);
 		int a = 77;
		System.out.println(a);
		System.out.println(this.a);
	}
}
