package com.april11;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6};
		int b = 2;
		
		System.out.println(1/2);
		System.out.println(2/2);
		
		try {
//		System.out.println(3/0);
//		System.out.println(a[3]/0);
		System.out.println(a[30]/b);
		} 
		catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Please do not divide by zero");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Invalid index of array");
		}
		finally {
			System.out.println("claen up activity");
			System.out.println("Runs always");
		}
		
		System.out.println(4/2);
		System.out.println(5/2);
	}

}
