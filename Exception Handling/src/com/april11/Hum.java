package com.april11;

public class Hum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 20;
		
		if(a>b) {
			
			        //way 1
//			HumPadhaiNahiKarteHaiException obj1 = new HumPadhaiNahiKarteHaiException();
//			throw obj1;
			
			         //way 2
			throw new HumPadhaiNahiKarteHaiException("Time nahi hai..");
			
			
		} else {
			System.out.println("Nahi karenge...");
		}
	}

}
