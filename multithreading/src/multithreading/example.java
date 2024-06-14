package multithreading;

public class example extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println("Atul Sir");
		}
	}
}
