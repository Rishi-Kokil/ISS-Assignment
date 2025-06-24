package multithreading;

class VolatileWorker extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Running...");
        }
        System.out.println("Stopped.");
    }

    public void stopRunning() {
        running = false;
    }
}

public class VolatileDemo {
    public static void main(String[] args) throws InterruptedException {
        VolatileWorker worker = new VolatileWorker();
        worker.start();
        Thread.sleep(1000);
        worker.stopRunning();
    }
}
