package com.april2;

import java.lang.reflect.Array;

public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] db = { 45, 89, -87, -90, 23, 88 };

		// to get even numbers
//		for(int i=0; i<Array.getLength(db);i++) {
//			if(db[i]%2==0) {
//				System.out.println(db[i]);
//			}
//		}

		// or
//		for(int num: db){
//			if(num%2==0) {
//				System.out.println(num);
//			}

		// for -ve and odd numbers
//		for(int n:db) {
//			if(n<0 && n%2!=0) {
//				System.out.println(n);
//			}
//		}

		// assume first element from array is largest num
		int max = db[0];
		int max2 = db[1];

		// iterate all elements from array
		for (int n: db) {

			// compare every element with max num
			if (n>max) {

				// if element in array is max then assign that val as max

				// for 2nd max
				max2 = max;
				max = n;
				
//				//for largest
//				max = n;
			} else if(n>max2 && n<max) {
				max2 = n;
			}
		}
				System.out.println(max2);
	}

}