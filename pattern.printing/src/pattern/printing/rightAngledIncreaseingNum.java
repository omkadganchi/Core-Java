//     1 
//     2 3 
//     4 5 6 
//     7 8 9 10 




package pattern.printing;

public class rightAngledIncreaseingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=1;
		for (int i = 1; i<=4; i++) {
			for (int j =1; j<=i; j++) {
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
		}
	}

}
