package com.april2;

import java.lang.reflect.Array;

public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] db = { 45, 89, -87, -90, 23, 88 };

		
		// to get even numbers
		for (int i = 0; i < Array.getLength(db); i++) {
			if (db[i] % 2 == 0) {
				System.out.println(db[i]);
			}
		}
		System.out.println();

		
		
		// or
//		for (int num : db) {
//			if (num % 2 == 0) {
//				System.out.println(num);
//			}

			
			
			// for -ve and odd numbers
			for (int n : db) {
				if (n < 0 && n % 2 != 0) {
					System.out.println(n);
				}
			}
		}
	}
//}
