package com.april15;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "Jay", 88);
		
		
		ArrayList a1 = new ArrayList();
//		List l1 = new ArrayList();            // or this way also we can create object
//		Collection c1 = new ArrayList();      // or this way also we can create object(Best Way)
		
		a1.add(10);
		a1.add("Om");
		a1.add(true);
		a1.add(-20.5);
		a1.add(s1);
		
		System.out.println(a1);
		
		
		      //Angular bracket OR (in java) Generics (JDK 8 feature) 
		ArrayList<Student>salary = new ArrayList();
		
		salary.add(s1);
		salary.add(new Student(2, "Amit", 85));
		salary.add(new Student(3, "Akanksha", 90));
		salary.add(new Student(4, "Om", 88));
		salary.add(new Student(5, "Renuka", 70));
		
		for(Student s : salary) {
			if(s.getMarks()>86) {
				System.out.println(s.getRoll());
			}
		}
		
		System.out.println(salary.get(1).getMarks()); //prints marks of 1st indexed of object
	}

}
