package com.march14;

public class Test_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo d1 = new Demo();

//calling static var value through obj ref
System.out.println(d1.a);

//calling static var value through class name
System.out.println(Demo.a);

//can change val through obj & class
Demo.a = 90; // or d1.a=90;
System.out.println(d1.a);

d1.addTwo(66, 41);
Demo.addTwo(d1.a, 10);
Demo.addTwo(45, 030);
	}

}
