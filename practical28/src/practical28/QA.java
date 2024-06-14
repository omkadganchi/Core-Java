package practical28;

import java.util.Scanner;

public class QA {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the initial limit: ");
     int a = sc.nextInt();
     System.out.print("Enter the upper limit: ");
     int b = sc.nextInt();
     
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FIZZBUZZ");
			} else if (i % 3 == 0) {
				System.out.println("FIZZ");
			} else if (i % 5 == 0) {
				System.out.println("BUZZ");
			} else {
				System.out.println(i);
			}
		}
	}

}
