package multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;


class Task implements Runnable {
	
	private int id;
	
	Task(int id){
		this.id = id;
	}
	
	public void run() {
		System.out.println("Task "+ id +" Executed By : " + Thread.currentThread().getName());
	}
}

public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(int i = 0; i <= 5; i++) {
			service.submit(new Task(i));
		}
		
		service.shutdown();
	}
}
