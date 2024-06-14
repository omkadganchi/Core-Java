package com.april16;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		
		hs.add("SAI");
		hs.add(-20.6);
		hs.add(10);
		hs.add(true);
		hs.add(10);
		
		System.out.println(hs);
		
		
		
		Set<Integer> hs1 = new TreeSet();
		
		hs1.add(89);
		hs1.add(-20);
		hs1.add(10);
		hs1.add(55);
		hs1.add(100);
		hs1.add(10);     //doesn't display duplicate values 
		
		System.out.println(hs1);
		
		
Set<Integer> hs2 = new LinkedHashSet();
		
		hs2.add(89);
		hs2.add(-20);
		hs2.add(10);
		hs2.add(55);
		hs2.add(100);
		hs2.add(10);     //doesn't display duplicate values 
		
		System.out.println(hs2);
	}

}
