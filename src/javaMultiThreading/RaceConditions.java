package javaMultiThreading;

class Counter{
	int count;
	public void increment() {
		count++;
}
class FtThread implements Runnable {
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			
			}
		}
	}
}

class SecThread implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			count++;
		}
	}
}
public class RaceConditions {
	public static void main(String[] args) {
		Runnable ft = new FtThread();
		Runnable st = new SecThread();
		
		Counter c = new Counter();

		Thread t1 = new Thread(ft);
		Thread t2 = new Thread(st);
		t1.start();
		t2.start();
	}
}
