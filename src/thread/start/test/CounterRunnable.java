package thread.start.test;

import util.MyLogger;

public class CounterRunnable implements Runnable {

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
//        CounterRunnable counterRunnable = new CounterRunnable();
//        Thread thread = new Thread(counterRunnable);

        Thread thread = new Thread(new Runnable() {
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
        });

//        Thread thread = new Thread(() -> {
//            for (int i = 1; i <= 5; i++) {
//                MyLogger.log(i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
        thread.start();
    }
}
