package pattern.printing;

public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;

//upper part
		for (int i = 1; i <= n; i++) {
			// stars
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			//spaces
			for (int j=1; j<=2*(n-i); j++) {
				System.out.print("  ");
			}
			//stars
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		
//lower part
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			for(int j=1; j<=2*(n-i); j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
