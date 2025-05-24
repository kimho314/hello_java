package thread.start;

import static util.MyLogger.log;

public class ManyThreadMainV1 {

    public static void main(String[] args) {
        log("main() start");

        HelloRunnable runnable1 = new HelloRunnable();
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        Thread thread2 = new Thread(runnable1);
        thread2.start();
        Thread thread3 = new Thread(runnable1);
        thread3.start();

        log("main() end");
    }
}
