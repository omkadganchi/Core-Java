package com.constructor;

public class example {
	int num1;
	int num2;
	int num3;
	int num4;

	example(int n1, int n2, int n3, int n4) {
		num1 = n1;
		num2 = n2;
		num3 = n3;
		num4 = n4;
	}

	void sum() {
		int totalsum = num1 + num2 + num3 + num4;
		System.out.println("Total Sum is: " + totalsum);
	}

	void avg() {
		int average = (num1 + num2 + num3 + num4) / 4;
		System.out.println("Average is: " + average);
	}

	void displayValues() {
		System.out.println("Values are:-");
		System.out.println("num1:" + num1 + "  num2:" + num2 + "  num3:" + num3 + "  num4:" + num4);
	}
}
