package javaMultiThreading;

class FirstThread extends Thread{
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println("Hi");
			}
	}
}

class SecondThread extends Thread{
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println("Hello");
			}
	}
}

class PracticeThreads {
	public static void main(String args[]) {
		FirstThread fc = new FirstThread();
		SecondThread sc = new SecondThread();
		fc.start();
		sc.start();
	}
}
