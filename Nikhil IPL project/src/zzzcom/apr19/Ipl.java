package zzzcom.apr19;
import java.util.Scanner;

public class Ipl {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("***Wellcome in ipl 2024***");

		while (true) {
			
			System.out.print("\n 1.MI - Mumbai Indians "
					+ "\n 2.CSK - Chennai Super Kings "
					+ "\n 3.RCB - Royal Challengers Banglore "
					+ "\n 4.KKR - Kolkata Knight Riders "
					+ "\n\nChoose the team :");
			
			int a = s.nextInt();

			switch (a) {

			case 1:
				Mi.mi();
				break;

			case 2:
				Csk.csk();
				break;

			case 3:
				Rcb.rcb();
				break;
				
			case 4:
				Kkr.Kkr();
				break;
				
			default:
				System.out.println("\nEnter valid option ....");
				break;

			}

			Scanner s1 = new Scanner(System.in);
			
			System.out.print("\n1.Go to main menu"
					+ "\n2.exit"
					+ "\nchoose option :");
			
			int n = s1.nextInt();

			if (n == 2) {
				break;

			}
		}

		System.out.println("\n***Thank you***");

	}

		
}
