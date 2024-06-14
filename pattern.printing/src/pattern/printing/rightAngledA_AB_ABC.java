//    Enter the number: 4
//
//      A 
//      B C 
//      D E F 
//      G H I J 



package pattern.printing;

import java.util.Scanner;

public class rightAngledA_AB_ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = 'A';
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
