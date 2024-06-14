//         * 
//        * * 
//       * * * 
//      * * * * 
//     * * * * * 
//     * * * * * 
//      * * * * 
//       * * * 
//        * * 
//         * 

package pattern.printing;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;

             //upper part
		for(int i=1; i<=n; i++) {
			
			//space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			//star
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		//lower part
for(int i=n; i>=1; i--) {
			
			//space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			//star
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
System.out.println();
	}

}
