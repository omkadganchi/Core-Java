
public class FindMAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 12;
		int c = 9;
		
		if(a>b && a>c) {
			System.out.println("A is max");
		} else if(b>a && b>c) {
			System.out.println("B is max");
		} else if(c>a && c>b) {
			System.out.println("C is max");
		} else {
			System.out.println("All are same");
		}
	}

}
