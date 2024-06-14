package com.march26;

public class Eg_to_explain_SuperThis extends Parent {

	int a = 10;
	String s = "Java by Kiran";
	
	void m1() {
	String a = "Atul sir";
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
}
}
