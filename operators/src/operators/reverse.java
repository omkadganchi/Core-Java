package operators;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		int num = 369;
		int reverse = 0;
		int remainder;

		while (num != 0) {
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		}
		System.out.println(reverse);
	}
}
