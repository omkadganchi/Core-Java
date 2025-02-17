package Array;

import java.util.LinkedHashSet;

public class _Second_duplicate_from_array {

	public static void main(String[] args) {

//		int a[] = {11, 22, 22, 11, 11, 33, 22, 44, 33, 44, 55, 55};
//		int count=0;
//		
//		for(int i=0; i<a.length; i++) {
//			for (int j=i+1; j<a.length; j++) {
//				if(a[i]==a[j] && a[i]!=0) {
//					a[j]=0;
//					count++;
//  					if(count==2) {
//						System.out.println("Second duplicate from array : "+a[i]);
//  					}
//						break;
//				}
//			}
//		}

		
		
		
		                                   // OR

		
		
		
		
		int a[] = { 11, 22, 22, 11, 11, 22, 33, 55, 44, 55 };
		int count = 0;
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] == a[i] && a[i] != 0) {
					count++;
					hs.add(a[i]);
					a[j] = 0;
				}
			}
		}
	//	System.out.println(hs);

		int index = 0;
		for (Integer integer : hs) {
			if (index == 1) {
				System.out.println("Second Duplicate from Array: " + integer);
				break;
			}
			index++;
		}

	}
}