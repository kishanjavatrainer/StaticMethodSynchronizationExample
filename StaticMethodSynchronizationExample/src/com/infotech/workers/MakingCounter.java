package com.infotech.workers;

public class MakingCounter extends Thread {
//java.lang.Class
	private static int counter;
	
	@Override
	public void run() {
		for (int i = 1; i <=20000; i++) {
				increment();
		}
	}

	//Static block synchronization
	private static  void increment() {
		String tName = Thread.currentThread().getName();
		System.out.println(tName);
		synchronized (MakingCounter.class) {
			counter++;
		}
	}
	
	//Static Method synchronization
	/*private static synchronized void increment() {
		String tName = Thread.currentThread().getName();
		System.out.println(tName);
			counter++;
	}*/
	public static int getCounter() {
		return counter;
	}
}
