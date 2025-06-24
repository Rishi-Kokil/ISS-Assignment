package multithreading;

class SharedPrinter {
    public synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " printed by " + Thread.currentThread().getName());
        }
    }
}

class SyncMethodWorker extends Thread {
    SharedPrinter printer;

    SyncMethodWorker(SharedPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printNumbers();
    }
}

public class SynchronizedMethodDemo {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();
        SyncMethodWorker t1 = new SyncMethodWorker(printer);
        SyncMethodWorker t2 = new SyncMethodWorker(printer);
        t1.start();
        t2.start();
    }
}
