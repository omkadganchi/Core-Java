package operators;

public class whileloop3_TotalCount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123;
		int count = 0;
		int i = 1;

		while (i <= n) {
		  n = n / 10;
			count++;
		}
		System.out.println("Total count of given num is: "+count);
	}
}
