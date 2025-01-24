public class armstrong {
	public static void main(String[] args) {
		
		int num = 371;
		int originalNum = num;
		int powerDigit = String.valueOf(originalNum).length();
		int sum = 0;
		
		while(num>0) {
			int digit = num % 10;
			sum += Math.pow(digit, powerDigit);
			num = num / 10;
		}
		
		if(sum == originalNum) {
			System.out.println(originalNum+" is armstrong number");
		} else {
			System.out.println(originalNum+" is not armstrong number");			
		}
	}
}