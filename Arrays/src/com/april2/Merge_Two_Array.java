package com.april2;

import java.util.Arrays;

public class Merge_Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 3, 5};
		int[] b = {2, 4, 6};
		
		int[] c = new int[a.length + b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println("Merged Array is: "+(Arrays.toString(c)));
	}

}






//public class Merge_Two_Array {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] a = {1, 3, 5};
//		int[] b = {2, 4, 6};
//		
//		int[] c = new int[a.length+b.length];
//		
//		for(int i=0; i<a.length; i++) {
//			c[i]=a[i];
//		}
//		
//		for(int i=0; i<b.length; i++) {
//			c[a.length+i]=b[i];
//		}
//	
//		System.out.println(Arrays.toString(c));
//	}
//}
