package com.march18;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		Person p2 = new Person("Om", 21, 7620905569l);
		
		System.out.println(p1.details(null, 0, 0));
		System.out.println();
		System.out.println(p2.details("Om Kadganchi", 7620905569L, 22));
		System.out.println();
		System.out.println(p2.details(21, 9545408509L));
		System.out.println();
		System.out.println(p2.details("Lavanya"));
		
	}

}
