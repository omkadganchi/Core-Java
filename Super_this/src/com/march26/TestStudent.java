package com.march26;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1 = new Student(1, "Jay", 88);
System.out.println("We are inside main method");
System.out.println(s1);
s1.m1();

System.out.println("---------------------------");

Student s2 = new Student(10, "Ajay", 99);
System.out.println("We are inside main method");
System.out.println(s2);
	}

}
