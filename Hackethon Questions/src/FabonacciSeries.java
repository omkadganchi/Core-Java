
public class FabonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 = 1;
		int num3;
		int num = 10;
		
		System.out.print(num1+" "+num2);
		
		
		for(int i=1; i<num; i++){
			num3 = num1 + num2;
			System.out.print(" "+num3);
			
			num1 = num2;
			num2 = num3;
		}
	}

}
