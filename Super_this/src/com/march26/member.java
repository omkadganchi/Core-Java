package com.march26;

public class member {
	private String name;
	private int age;

	member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}
}
