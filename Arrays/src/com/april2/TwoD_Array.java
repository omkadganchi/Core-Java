package com.april2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {{1,2,3},{4,5},{6,7,8,9}};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
