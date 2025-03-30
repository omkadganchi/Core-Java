package com.tka;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<Integer> a1 = new ArrayList();
//		a1.add(1);
//		a1.add(2);
//		a1.add(3);
//		a1.add(4);
//		a1.add(5);
//		a1.add(6);
//
//		ArrayList<Integer> a2 = new ArrayList();
//		a2.add(5);
//		a2.add(7);
//		a2.add(8);
//		a2.add(9);
//		a2.add(10);
//		a2.add(6);
//
//		ArrayList<Integer> a3 = new ArrayList();
//		a3.addAll(a1);
//		a3.addAll(a2);
//
//		System.out.println("Numbers that appear more than once:");
//		for (int i = 0; i < a3.size(); i++) {
//			int count = 0;
//			for (int j = i + 1; j < a3.size(); j++) {
//				if (a3.get(i).equals(a3.get(j))) {
//					count++;
//				}
//			}
//			// Only print if this number is found more than once and hasn't been printed yet
//			if (count > 0) {
//				System.out.println(a3.get(i));
//			}
//		}
		
		
		
		                                         //OR    (more accurate code)
		
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(5);
		a2.add(6);
		a2.add(7);
		a2.add(3);
		a2.add(8);
		a2.add(9);
		a2.add(10);
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.addAll(a1);
		a.addAll(a2);
		
		LinkedHashSet<Integer> seen = new LinkedHashSet<Integer>();
		
		LinkedHashSet<Integer> duplicates = new LinkedHashSet<Integer>();
		
		for (Integer i : a) {
			if(seen.contains(i)) {
				duplicates.add(i);
			} else {
				seen.add(i);
			}
		}
		System.out.println(duplicates);
	}
}
