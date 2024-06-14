//            0 
//          1 2 
//        3 4 5 
//      6 7 8 9 


package pattern.printing;

public class leftAngledIncrNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int m = 0;

		for (int i = 1; i <= n; i++) {

			// space
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// number
			for (int j = 1; j<=i; j++) {
				System.out.print(m + " ");
			    m++;
			}
			System.out.println();
		}
	}

}
