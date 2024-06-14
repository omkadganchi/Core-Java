//   A
//   A A
//   A A A
//   A A A A





package pattern.printing;

public class squareChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char n = 'A';
		
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}

}
