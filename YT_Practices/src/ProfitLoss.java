import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the selling price: ");
		int cp = sc.nextInt();
		System.out.print("Enter the cost price: ");
		int sp = sc.nextInt();
		
		if(sp>cp) {
			System.out.println("Profit: "+ (sp-cp)+" rs.");
		} else if(cp>sp) {
			System.out.println("Loss: "+ (cp-sp)+" rs.");
		} else {
			System.out.println("NO profit or loss.");
		}
	}

}
