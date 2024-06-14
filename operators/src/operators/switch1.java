//Find the number of days in a month

package operators;

import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int x = a.nextInt();
		System.out.println("Enter the number of month: ");
		int n = a.nextInt();

		switch (n) {
		case 1:
			System.out.println("January" + x + "has 31 days");
			break;

		case 2:
			if (x % 4 == 0 && (x % 400 == 0  || x % 100 != 0)) {
				System.out.println("February " + x + " has 29 days");
			} else {
				System.out.println("February " + x + " has 28 days");
			}
			break;
		case 3:
			System.out.println("March " + x + " has 31 days");
			break;
		case 4:
			System.out.println("April " + x + " has 30 days");
			break;
		case 5:
			System.out.println("May " + x + " has 31 days");
			break;
		case 6:
			System.out.println("June " + x + " has 30 days");
			break;
		case 7:
			System.out.println("July " + x + " has 31 days");
			break;
		case 8:
			System.out.println("August " + x + " has 31 days");
			break;
		case 9:
			System.out.println("September " + x + " has 30 days");
			break;
		case 10:
			System.out.println("October " + x + " has31 days");
			break;
		case 11:
			System.out.println("November " + x + " has 30 days");
			break;
		case 12:
			System.out.println("December " + x + " has 31 days");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
}
