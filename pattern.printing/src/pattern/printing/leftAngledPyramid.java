//           1 
//         1 2 
//       1 2 3 
//     1 2 3 4 
//   1 2 3 4 5 

package pattern.printing;

public class leftAngledPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

		for (int i = 1; i <= n; i++) {

			// space
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// number
			for (int j = 1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
