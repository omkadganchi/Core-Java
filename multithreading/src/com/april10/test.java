 package com.april10;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("We are in main method");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		task1 job1 = new task1();
		Thread t1 = new Thread(job1);
		t1.setName("Amazon");
//		t1.setPriority(4);
		t1.start();
		
		task2 job2 = new task2();
		Thread t2 = new Thread(job2);
		t2.setName("Flipkart");
//		t2.setPriority(10);
		t2.start();
//		job2.setName("Flipkart");
//		job2.setPriority(10);
//		job2.start();
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Atul sir");
//			Thread.sleep(1000);
//		}
		System.out.println("end of main thread");
	}

}
