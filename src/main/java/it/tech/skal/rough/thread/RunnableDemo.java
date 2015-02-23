package it.tech.skal.rough.thread;

public class RunnableDemo {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		
		// method 1
		myRunnable.run();
		for (int i = 0; i < 10; i++) {
			System.out.println("main 1 thread");
		}
		
		// method 2
		Thread myThread = new Thread(myRunnable);
		myThread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main 2 thread");
		}
	}

}
