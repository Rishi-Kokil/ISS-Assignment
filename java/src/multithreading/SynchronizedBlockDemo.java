package multithreading;

class BlockPrinter {
    public void printNumbers() {
        synchronized (this) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(i + " printed by " + Thread.currentThread().getName());
            }
        }
    }
}

class SyncBlockWorker extends Thread {
    BlockPrinter printer;

    SyncBlockWorker(BlockPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printNumbers();
    }
}

public class SynchronizedBlockDemo {
    public static void main(String[] args) {
        BlockPrinter printer = new BlockPrinter();
        SyncBlockWorker t1 = new SyncBlockWorker(printer);
        SyncBlockWorker t2 = new SyncBlockWorker(printer);
        t1.start();
        t2.start();
    }
}
