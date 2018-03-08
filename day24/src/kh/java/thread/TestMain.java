package kh.java.thread;

public class TestMain {
	public static void main(String[] args) {
//		Thread t1 = new Thread( new TestClass() );
//		Thread t2 = new Thread( new TimeAdd() );
//		
//		t1.start();
//		t2.start();
		
		
		Table t = new Table();// 1°³.
		Thread t1 = new MyThread1(t);
		Thread t2 = new MyThread2(t);
		
		t1.start();
		t2.start();
	}
}