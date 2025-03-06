package Array;

import java.util.Arrays;

public class firstEVENthenODD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,3,5,2,6,7,8,11};
		
		int left = 0;
		int right = a.length-1;
		
		while(left<right) {
			if(a[left]%2!=0 && a[right]%2==0) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
			else if(a[left]%2==0) {
				left++;
			} else if(a[right]%2!=0) {
				right--;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
