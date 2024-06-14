package calculator;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 10.35;
		double b = 6.21;
		
		addition task1 = new addition(a,b); 
		subtraction task2 = new subtraction(a,b);
		multiplication task3 = new multiplication(a,b);
		division task4 = new division(a,b);
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		Thread t3 = new Thread(task3);
		Thread t4 = new Thread(task4);
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	
	}

}
