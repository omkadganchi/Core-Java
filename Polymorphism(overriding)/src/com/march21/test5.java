package com.march21;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA a1 = new AA();
		BB b1 = new BB();
		a1 = b1;
		System.out.println(a1.a);
		System.out.println(a1.b);
//		System.out.println(a1.c);

		a1.m1();
		a1.m2();
//		a1.m3();
	}

}
