package pattern.printing;

public class K_Pattern {

    public static void main(String[] args) {
        int n = 5;
        
        //left part
        // upper part
        for (int i = 1; i <=n; i++) {

            // star
            for (int j = 1; j <= n - i+1; j++) {
                System.out.print("* ");
            }
            //space
            for(int j=1; j<=n-i; j++) {
            	System.out.print("  ");
            }
            System.out.println();
        }

        // lower part
        for (int i = n; i >= 1; i--) {

            // star
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            
            //space
            for(int j=1; j<=n-i; j++) {
            	System.out.print("  ");
            }
            System.out.println();
        }
    }
}

