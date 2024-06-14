package com.constructor;

public class Employee {
	String name;
	int age;
	String department;
	String position;
	int salary;

	Employee(String n, int a, String d, String p, int s) {
		name = n;
		age = a;
		department = d;
		position = p;
		salary = s;

	}

	public void m1() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Department: " + department);
		System.out.println("Position: " + position);
	}

	public void m2() {
//		 name = newName;
//		age = newAge;
//		department = newDepartment;
//		position = newPosition;
		System.out.println("salary: " + salary);

	}

}
