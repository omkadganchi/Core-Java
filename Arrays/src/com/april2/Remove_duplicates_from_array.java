package com.april2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Remove_duplicates_from_array {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 3, 5, 6, 2, 7 };

		HashSet<Integer> hs = new HashSet<Integer>();

		for (Integer i : a) {
			hs.add(i);
		}
		System.out.println(hs + "\n\n\n\n");
		
		
		
		
		                   // OR
		
		List<Integer> list = Arrays.asList(10, -16, 5, 58, -1, 60, 19);

		List<Integer> uniqueList = list.stream().sorted().toList();

		System.out.println(uniqueList);

		
		
		
		
		                     // OR

//		int[] a = { 1, 2, 3, 4, 3, 5, 6, 2, 7 };
//
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i]==a[j]) {
//					a[j]=0;
//				}
//			}
//			if(a[i]!=0) {
//				System.out.println(a[i]+" ");
//			}
//		}

		
		
		
		                     // OR

//		System.out.println("Before removing duplicates: "+Arrays.toString(a));
//		
//		for(int i=0; i<a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				if(a[i]==a[j]) {
//				a[j]=-1;   //-1 denotes duplicate number
//				}
//			}
//		}
//		
//		
//		System.out.print("\nAfter removing duplicates: ");
//		for(int i=0; i<a.length; i++) {
//			if(a[i]!=-1) {
//				System.out.print(a[i]+" ");
//			}
//		}
		
		
		
		                     //OR
		
//      Integer[] a = {1,2,4,3,2,4,5,6,5};   //stream is work with objects not with primitive data types
//		System.out.println(Arrays.asList(a).stream().distinct().toList());
	}
}