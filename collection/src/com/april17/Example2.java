package com.april17;

import java.util.HashMap;

import com.april15.Student;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Student>hm = new HashMap();
		
		hm.put(1, new Student(1,"Jay",88));
		hm.put(2, new Student(2,"Viru",99));
		hm.put(3, new Student(1,"Gabbar",77));
		hm.put(4, new Student(2,"Basanti",66));
		hm.put(5, new Student(1,"Thakur",55));
		hm.put(6, new Student(2,"ramlal",44));
		
		String r = "Roll Number";
		String n = "Name of Student";
		
		System.out.println("|--------------- | --------------- | --------------- |");
		System.out.printf("|%-15s | %15s | %-15s |\n",r,n,"Marks");
		System.out.println("|--------------- | --------------- | --------------- |");
		for(int i :hm.keySet()) {
			System.out.printf("|%-15d | %-15s | %-15d |\n",i,hm.get(i),hm.get(i).getMarks());
			System.out.println("|--------------- | --------------- | --------------- |");
		}
	}

}
