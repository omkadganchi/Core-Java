package operators;

import java.util.Scanner;

public class ReverseNumUsingWhileLoop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int reverse = 0;

		while (n != 0) {
			int r = n % 10;
			reverse = (reverse * 10) + r;
			n = n / 10;
		}
		System.out.println("Reverse number is: " + reverse);
	}

}
