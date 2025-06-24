package multithreading;

class UnsafeCounter implements Runnable {
    private int count = 0;

    public void run() {
        for (int i = 0; i < 1000; i++) {
            count++; // not thread-safe
        }
        System.out.println("Count (shared): " + count);
    }
}

class SafeCounter implements Runnable {
    public void run() {
        int localCount = 0; // thread-safe
        for (int i = 0; i < 1000; i++) {
            localCount++;
        }
        System.out.println("Count (local): " + localCount);
    }
}

public class ThreadSafetyDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new UnsafeCounter());
        Thread t2 = new Thread(new UnsafeCounter());
        t1.start();
        t2.start();

        Thread t3 = new Thread(new SafeCounter());
        Thread t4 = new Thread(new SafeCounter());
        t3.start();
        t4.start();
    }
}
