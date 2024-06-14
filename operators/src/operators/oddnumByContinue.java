package operators;

import java.util.Scanner;

public class oddnumByContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number: ");
			int n = sc.nextInt();
			System.out.println();

			for (int i = 1; i < 11; i++) {
				if (i % 2 == 0) {
					continue;
				}
				System.out.println(n + "*" + i + "=" + n * i);
			}
			Scanner sc1 = new Scanner(System.in);
			System.out.println();
			System.out.println("Please select the option:");
			System.out.println("press '0' to Continue" + '\n' + "press '1-9' to Termination");
			char ch = sc1.next().charAt(0);
			if (ch == '0') {
				continue;
			} else {
				break;
			}
		}
		System.out.println();
	}

}
