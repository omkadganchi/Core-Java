package com.april2;

import java.util.Arrays;

public class zeros_at_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] a = {1, 0, 2, 0, 3, 4, 0, 5, 0};
		 
		 for(int i=0; i<a.length; i++) {
			 for(int j=i+1; j<a.length; j++) {
				 if(a[i]==0 && a[j]!=0) {
					 int temp = a[j];
					 a[j] = a[i];
					 a[i] = temp;
				 }
			 }
		 }
		 System.out.println(Arrays.toString(a));
	}

}




          //FOR ZERO AT BEGINNING

//      just flip the condition
//       (a[i]!=0 && a[j]==0) 