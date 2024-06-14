package com.april17;

import java.util.HashMap;


public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String>hm = new HashMap();
		
		hm.put(11, "Jay");
		hm.put(4, "Viru");
		hm.put(8, "Gabbar");
		hm.put(4, "Basanti");
		hm.put(7, "Jay");
		
//		System.out.println(hm);
//		System.out.println(hm.get(4));
//		System.out.println(hm.keySet());
//		System.out.println(hm.hashCode());
//		System.out.println(hm.size());
//		System.out.println(hm.values());
//		System.out.println("\n\n");
		
		
		
		String r = "Roll Number";
		String n = "Name of Student";
		
		System.out.println("|--------------- | --------------- |");
		System.out.printf("|%-15s | %15s |\n",r,n);
		System.out.println("|--------------- | --------------- |");
		for(int i :hm.keySet()) {
			System.out.printf("|%-15d | %-15s |\n",i,hm.get(i));
			System.out.println("|--------------- | --------------- |");
		}
	}

}
