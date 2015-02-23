package it.tech.skal.rough.thread;

public class MyRunnable implements Runnable{

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child method");
		}
		
	}

}
