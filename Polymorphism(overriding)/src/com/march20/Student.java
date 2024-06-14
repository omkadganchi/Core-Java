package com.march20;

public class Student extends Teacher {
	int totalLearningHrs = 180;
    
	@Override
	void expertise() {
		System.out.println("Java Full Stack Development");
	}
	
	void className() {
		System.out.println("TKA");
	}
}
