package com.march14;

public class Test_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample.m1();
System.out.println();

System.out.println("changed value of static var");
Sample.cname = "TKA";
Sample.m1();
System.out.println();

Sample s1 = new Sample(12, "Rasika");
s1.m2();
s1.cname = "JBK";
s1.m2();
	}

}