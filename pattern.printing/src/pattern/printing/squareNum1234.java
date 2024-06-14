//   Enter the number: 5
//   1 2 3 4 5 
//   1 2 3 4 5 
//   1 2 3 4 5 
//   1 2 3 4 5 
//   1 2 3 4 5 


package pattern.printing;

import java.util.Scanner;

public class squareNum1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}