package practical28;

import java.util.Scanner;

public class forloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();

		for (int i = 1; i < 11; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}
		sc.close();
	}

}
