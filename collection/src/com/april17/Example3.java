package com.april17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, ArrayList> moviesdb = new HashMap();
		
		ArrayList<String> cast1 = new ArrayList();
		ArrayList<String> cast2 = new ArrayList();
		
		cast1.add("RK");
		cast1.add("DP");
		cast1.add("KK");
		cast1.add("ARK");
		
		cast2.add("SK");
		cast2.add("SAK");
		cast2.add("SB");
		cast2.add("KK");
		cast2.add("MB");
		cast2.add("TH");
		
		
		moviesdb.put("YJHD",cast1);
		moviesdb.put("HSSH", cast2);
		System.out.println(moviesdb);
		System.out.println(moviesdb.keySet());
		System.out.println(moviesdb.values());
		
		System.out.println("\n\n");
		for(ArrayList a:moviesdb.values()) {
			for(Object s:a) {
				if((String)s=="DP")
			System.out.println((String)s);
		}
	}
		
		System.out.println("\n\n");
		for(ArrayList a:moviesdb.values()) {
			for(Object s:a) {
			System.out.println((String)s);
		}
	}
	}
}
