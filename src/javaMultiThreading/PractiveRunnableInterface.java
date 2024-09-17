package javaMultiThreading;

class FtThread implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class SecThread implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class PractiveRunnableInterface {

	public static void main(String[] args) {
		Runnable ft = new FtThread();
		Runnable st = new SecThread();

		Thread t1 = new Thread(ft);
		Thread t2 = new Thread(st);
		t1.start();
		t2.start();
	}

}
