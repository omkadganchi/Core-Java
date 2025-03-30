package com.april2;

import java.util.Arrays;
import java.util.List;

public class Ascending_Order_Sorting {

	public static void main(String[] args) {

		int[] a = {10, 5, 3, 8, 1, 36};
		
		System.out.println("original array is: "+Arrays.toString(a));
		
       Arrays.sort(a);
           
           //OR
       
     //  Arrays.sort(a, 0, a.length-1);
       
       System.out.println("Sorted Ascending Array is: "+Arrays.toString(a));
       
            //OR
       
       List<Integer> list = Arrays.asList(10, -16, 5, 58, -1, 60, 19);
		
		List<Integer> uniqueList = list.stream().sorted().toList();
		
		System.out.println(uniqueList);
	}
}