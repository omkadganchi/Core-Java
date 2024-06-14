//        Enter the upper limit: 5
//        A 
//        A B 
//        A B C 
//        A B C D 
//        A B C D E



package pattern.printing;

import java.util.Scanner;

public class IcreasingRightAngledNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter the upper limit: ");
int n= sc.nextInt();

		for (int i = 1; i <=n; i++) {
			char a='A';
			
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
	}

}
