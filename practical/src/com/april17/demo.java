package com.april17;

import java.util.HashMap;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Student>db = new HashMap();
		
		db.put(1, new Student(1,"Jay", 88));
		db.put(2, new Student(10,"Nikhil", 99));
		db.put(3, new Student(2,"Atul Sir", 100));
		db.put(4, new Student(15,"Vijay", 68));
		db.put(5, new Student(10,"Om", 99));
		
		
		System.out.println(db.keySet());
		System.out.println(db.containsKey(6));
		
	}

}
