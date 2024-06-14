package operators;

import java.util.Scanner;

public class xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

		if(n>=0) {
			if(n%2==0) {
				System.out.println("even & +ve");
			} else {
				System.out.println("odd & +ve");
			}
		} else {
			if(n%2==0) {
				System.out.println("even & -ve");
			} else {
				System.out.println("odd & -ve");
			}
		}
	}

}
