package com.april16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l1 = new ArrayList();
		
		l1.add(1);
		l1.add("Pavan");
		l1.add("Akanksha");
		l1.add(90);
		l1.add("Nikhil");
		l1.add(true);
		l1.add(-20.6);
		
		System.out.println("List of elements: "+l1+"\n");
		
		Set s = new HashSet();
		
		s.add(1);
		s.add("Pavan");
		s.add("Amit");
		s.add(90);
		s.add(false);
		
		System.out.println("Set of elements: "+s+"\n");
		
		l1.addAll(s);
		System.out.println("List of Sets(adding set into list): "+l1+"\n");
	
	
		s.addAll(l1);
		System.out.println("Set of List(adding list into set): "+s+"\n");
	}

}
