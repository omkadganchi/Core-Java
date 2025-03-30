package com.april2;

public class student {
	private String name;
	private int rollNo;
	private int marks;
	private static String degree = "B.Tech";
	
	student(String name,int rollNo,int marks){
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public static String getDegree() {
		return degree;
	}

	public static void setDegree(String degree) {
		student.degree = degree;
	}


}
