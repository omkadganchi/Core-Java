package operators;

import java.util.Scanner;

public class tablesUsingWhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number: ");
			int n = sc.nextInt();
			System.out.println();

			for (int i = 1; i < 11; i++) {
				System.out.println(n + "*" + i + "=" + n * i);
			}
			Scanner sc1 = new Scanner(System.in);
			System.out.println();
			System.out.println("Please select the option:");
			System.out.println("press '1' to Continue" + '\n' + "press '2' to Termination");
			char ch = sc1.next().charAt(0);
			if (ch == '2') {
				break;
			}
			System.out.println();
		}
	}
}
