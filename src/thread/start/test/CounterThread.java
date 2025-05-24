package thread.start.test;

import util.MyLogger;

public class CounterThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            MyLogger.log(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        counterThread.start();
    }
}
