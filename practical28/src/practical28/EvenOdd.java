package practical28;

public class EvenOdd {
	public static void main(String[] args) {
		int n = 11;
		int even = 0;
		int odd = 0;
		int count =0;
		int count1 =0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				even += i;
				count++;
			} else {
				odd += i;
				count1++;
			}
		}
		System.out.println("Sum of EVEN numbers: " + even+" total count: "+count);
		System.out.println("Sum of ODD numbers: " + odd+" total count: "+count1);
	}
}
