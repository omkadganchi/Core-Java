package com.april10;

public class task1 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getPriority());
		
		for (int i = 0; i < 5; i++) {
//			System.out.println("JBK");
			
			Demo.paynow(100);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end of job1");
	}
}
