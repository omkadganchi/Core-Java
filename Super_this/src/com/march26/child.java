package com.march26;

public class child extends Parent {
    
	int roll;
	String name;
	int marks;
	int a = 90;
	String s = "TKA";
	
	child(int r){
		System.out.println("This is one parameter contructor");
		this.roll = r;
	}
	
	child(int r, String n){
		this(r);
		System.out.println("This is two parameter constructor");
	    this.name = n;
	}
	
	child(int r, String n, int m){
		this(r,n);
		System.out.println("This is three parameter constructor");
	    this.marks = m;
	}

	@Override
	void display() {
		System.out.println(this.a);
		System.out.println(s);
		
		System.out.println(super.a);
		System.out.println(super.s);
	}
	
	void marry() {
		super.marry();
		System.out.println("Girl B");
	}
}
