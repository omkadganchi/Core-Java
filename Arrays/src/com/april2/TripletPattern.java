package com.april2;

import java.util.Arrays;

public class TripletPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] a = {1, 4, 5, 6, 3};
        int target = 12;
        int count = 0;
        
        for (int i=0; i<a.length; i++) {
            for (int j=i+1; j<a.length; j++) {
                for (int k=j+1; k<a.length; k++) {
                    if (a[i] + a[j] + a[k] == target) {
                        System.out.println(Arrays.asList(a[i], a[j], a[k]));
                        count++;
                    }
                }
            }
        }
        System.out.println("Total count whose sum is equal to target: " + count);
	}

}
