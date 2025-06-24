package multithreading;



class MyTask extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Is running");
	}
}


public class BasicThreadDemo {
	public static void main(String[] args) {
		MyTask t1 = new MyTask();
		MyTask t2 = new MyTask();
		
		
		t1.run();
		t2.run();
	}
}
